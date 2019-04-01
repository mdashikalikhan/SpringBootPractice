package com.boot.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.practice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}