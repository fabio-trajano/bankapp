package com.bankapp.bankapp.service;


import com.bankapp.bankapp.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> findByUsername(String username);
}