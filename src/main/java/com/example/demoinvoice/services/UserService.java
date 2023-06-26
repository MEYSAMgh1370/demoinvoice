package com.example.demoinvoice.services;

import com.example.demoinvoice.models.authentication.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}
