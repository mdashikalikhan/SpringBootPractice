package com.boot.practice.service;

import com.boot.practice.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
