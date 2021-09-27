package com.exam.quiz.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.quiz.models.Role;
import com.exam.quiz.models.User;
import com.exam.quiz.models.UserRole;
import com.exam.quiz.service.UserService;

@RestController

@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	//create user
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
	Role role =new Role();
	role.setId(2);
	role.setRole("normal");
	
	Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole =new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoleSet.add(userRole);
	
		
		return this.userService.createUser(user, userRoleSet);
		
	}
	
	@GetMapping("/{userName}")
	public User getByUserName(@PathVariable(name="userName") String userName) {
		return this.userService.findByUserName(userName);
		
	}
	
	@DeleteMapping("/{user_id}")
	public void delete(@PathVariable(name="user_id") long id) {
	this.userService.deleteUser(id);
	}
	

	

}
