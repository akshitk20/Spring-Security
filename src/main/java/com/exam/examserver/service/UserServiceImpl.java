package com.exam.examserver.service;

import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import com.exam.examserver.repository.RoleRepository;
import com.exam.examserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User createUser(User user, List<UserRole> userRoles) throws Exception{
        User local = userRepository.findByUsername(user.getUsername());
        if(Objects.nonNull(local)){
            System.out.println("User is already present there !!");
            throw new Exception("User already present !!");
        }else {
            //create user
            userRoles.forEach(userRole -> roleRepository.save(userRole.getRole()));
            user.getUserRoles().addAll(userRoles);
            local = userRepository.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
