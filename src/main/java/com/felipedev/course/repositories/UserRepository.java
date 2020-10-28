package com.felipedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.course.entities.User;


public interface UserRepository  extends JpaRepository<User, Long>{
	
	
}
