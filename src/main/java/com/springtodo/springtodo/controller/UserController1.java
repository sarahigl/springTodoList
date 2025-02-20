package com.springtodo.springtodo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springtodo.springtodo.model.User1;
import com.springtodo.springtodo.service.UserService;

@RestController
public class UserController1 {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User1> getUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/addUsers")
    public void addUser(@RequestBody User1 user1) {
        System.out.println(user1.toString());
        userService.addUser(user1);
    }
    @GetMapping("/user/{id}")
    public Optional<User1> findById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
