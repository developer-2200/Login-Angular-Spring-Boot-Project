package com.example.demo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User,String>{

	public Optional<User> findByEmail(String email);
	
}
