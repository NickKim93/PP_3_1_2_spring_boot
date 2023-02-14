package com.example.pp_3_1_2_spring_boot.service;

import com.example.pp_3_1_2_spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);
}
