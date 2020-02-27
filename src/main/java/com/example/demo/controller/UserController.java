package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    IUserService userService;

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user ) {
        User response = userService.addUser(user);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> userList = userService.getUsers();
        return ResponseEntity.ok(userList);
    }

}
