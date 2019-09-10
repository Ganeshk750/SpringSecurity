package com.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganesh.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
