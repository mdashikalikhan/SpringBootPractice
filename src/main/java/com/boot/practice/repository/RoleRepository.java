package com.boot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.practice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
