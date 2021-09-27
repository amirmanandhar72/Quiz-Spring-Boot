package com.exam.quiz.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.quiz.models.User;
import com.exam.quiz.models.UserRole;
import com.exam.quiz.repository.RoleRepository;
import com.exam.quiz.repository.UserRepository;
import com.exam.quiz.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception  {
		
		User local= this.userRepository.findByUserName(user.getUserName());
		if(local != null) {
			System.out.println("username already taken");
			throw new Exception("Username is already taken");
		}
		for(UserRole ur:userRoles) {
			this.roleRepository.save(ur.getRole());
		}
		user.getUserRoles().addAll(userRoles);
		local = this.userRepository.save(user);
		
		return local;
		
	}

	@Override
	public User findByUserName(String userName) {
		User user = this.userRepository.findByUserName(userName);
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
		
	}
	


}
