package com.exam.examserver.service;

import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {
    //creating user
    User createUser(User user, List<UserRole> userRole) throws Exception;

    User getUser(String username);

    void deleteUser(Long id);
}
