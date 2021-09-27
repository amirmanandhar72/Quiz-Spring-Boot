package com.exam.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.quiz.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUserName(String userName);

}
