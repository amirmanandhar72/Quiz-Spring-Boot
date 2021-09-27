package com.exam.quiz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class QuizAuthApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(QuizAuthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("starting cpde");
//		
//		User user =new User();
//		user.setEmail("amir@gmail.com");
//		user.setFirstName("Amir");
//		user.setLastName("Manandhar");
//		user.setUserName("amirmanandhar72");
//		user.setPassword("amir");
//		
//		Role role= new Role();
//		role.setRole("admin");
//		role.setId(1);
//		
//		Set<UserRole> userRolesSet = new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		
//		userRolesSet.add(userRole);
//		
//		User user1 =this.userService.createUser(user, userRolesSet);
//		System.out.println(user1);
		
		
	}
 
}
