package com.felipedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.course.entities.Category;


public interface CategoryRepository  extends JpaRepository<Category, Long>{
	
	
}
