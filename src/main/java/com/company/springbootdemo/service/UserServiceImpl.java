package com.company.springbootdemo.service;

import com.company.springbootdemo.data.model.User;
import com.company.springbootdemo.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements
    UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
        // todo check if exists and throw exception if alread there, etc.
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
        // todo check if exists and throw exception if not, etc
    }

    @Override
    public void deleteUser(User user) {
        userRepository.deleteById(user.getId());
    }

    @Override
    public User getUser(long id) {
        return userRepository.getOne(id);
    }
}