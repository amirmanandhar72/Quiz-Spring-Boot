package com.exam.quiz.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	@Id
	private long id;
	private String role;
	
	//role has multiple users
	@OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY, mappedBy = "role")
	private Set<UserRole> userRoles =new  HashSet<>();
	
	public Role() {
		
	}
	
	public Role(long id, String role) {
		this.id = id;
		this.role = role;
	}
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
