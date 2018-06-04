package com.company.springbootdemo.service;

import com.company.springbootdemo.data.model.User;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
}
