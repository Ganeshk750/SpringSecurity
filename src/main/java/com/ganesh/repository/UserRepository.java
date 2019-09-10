package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
