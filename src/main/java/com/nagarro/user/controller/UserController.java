package com.nagarro.user.controller;

import com.nagarro.user.entity.User;
import com.nagarro.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }
}
