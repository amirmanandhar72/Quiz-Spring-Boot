package com.exam.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.quiz.models.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
