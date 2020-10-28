package com.felipedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.course.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Long>{
	
	
}
