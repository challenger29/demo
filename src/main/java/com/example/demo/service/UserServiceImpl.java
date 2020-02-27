package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
