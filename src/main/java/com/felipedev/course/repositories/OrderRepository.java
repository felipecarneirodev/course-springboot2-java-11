package com.felipedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.course.entities.Order;


public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	
}
