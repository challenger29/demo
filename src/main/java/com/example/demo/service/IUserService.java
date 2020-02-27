package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface IUserService {

    User addUser(User user);
    List<User> getUsers();
}
