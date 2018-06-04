package com.company.springbootdemo.service;

import com.company.springbootdemo.data.model.User;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements
    UserService {

    private Set<User> users = new HashSet<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        // todo check if exists and throw exception if alread there, etc.
    }

    @Override
    public void updateUser(User user) {
        users.add(user);
        // todo check if exists and throw exception if not, etc
    }
}