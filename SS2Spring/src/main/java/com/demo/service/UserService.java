package com.demo.service;

import com.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    String createUser(User user);
    String deleteUser(String username);
    User findUserByUsername(String userName);
    User updateUser(User user);
}
