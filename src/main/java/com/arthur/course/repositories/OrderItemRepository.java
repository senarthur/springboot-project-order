package com.arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
