package com.exam.examserver;

import com.exam.examserver.models.Role;
import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
//		User user = new User();
//		user.setFirstName("Akshit");
//		user.setLastName("Khatri");
//		user.setUsername("akshit");
//		user.setPassword("abc");
//		user.setEmail("abc@gmail.com");
//		user.setProfile("default.png");
//
//		Role role = new Role();
//		role.setRoleName("ADMIN");
//
//		List<UserRole> userRoles = new ArrayList<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoles.add(userRole);
//
//		user.setUserRoles(userRoles);
//		User user1 = userService.createUser(user, userRoles);
//		System.out.println(user1.getFirstName());
	}
}
