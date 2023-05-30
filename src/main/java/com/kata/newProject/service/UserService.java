package com.kata.newProject.service;

import com.kata.newProject.model.User;

import java.util.List;

public interface UserService {
    public User findById(Long id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);
}
