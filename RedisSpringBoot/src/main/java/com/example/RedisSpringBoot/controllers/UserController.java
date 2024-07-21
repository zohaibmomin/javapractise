package com.example.RedisSpringBoot.controllers;

import com.example.RedisSpringBoot.dao.UserDAO;
import com.example.RedisSpringBoot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    public UserDAO userDAO;

    @PostMapping
    public User createUser(@RequestBody User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userDAO.saveUser(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userDAO.getUser(userId);
    }

    @GetMapping
    public Map<Object, Object> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @DeleteMapping("/{userId}")
    public Long deleteUser(@PathVariable("userId") String userId) {
        return userDAO.deleteUser(userId);

    }
}
