package com.arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
