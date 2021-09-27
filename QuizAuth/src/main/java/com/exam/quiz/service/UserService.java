package com.exam.quiz.service;

import java.util.Set;

import com.exam.quiz.models.User;
import com.exam.quiz.models.UserRole;

public interface UserService {
	
	//creating user
	public User createUser(User user,Set<UserRole> userRoles ) throws Exception;
	
	public User findByUserName(String userName);
	
	public void deleteUser(Long id);

}
