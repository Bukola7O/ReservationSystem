package com.example.reservationsystem.service;

import org.springframework.stereotype.Service;


public interface UserService {
    boolean authenticate(String username, String password);
}
