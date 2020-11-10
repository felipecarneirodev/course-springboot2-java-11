package com.felipedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipedev.course.entities.OrderItem;


public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{
	
	
}
