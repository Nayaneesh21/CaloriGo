package com.calorigo.service;

import com.calorigo.model.User;

public interface AuthenticationService {
    User login(String email, String password);
    User register(User user);
}
