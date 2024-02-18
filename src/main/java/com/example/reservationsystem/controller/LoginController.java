package com.example.reservationsystem.controller;

import com.example.reservationsystem.model.User;
import com.example.reservationsystem.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private UserService userService;

    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        return userService.authenticate(user.getUsername(), user.getPassword());
    }
}
