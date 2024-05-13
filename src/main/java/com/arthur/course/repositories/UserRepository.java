package com.arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
