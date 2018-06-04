package com.company.springbootdemo.controller.rest;

import com.company.springbootdemo.data.model.User;
import com.company.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/makeUser")
    public User greeting(
        @RequestParam(value="first") String firstName,
        @RequestParam(value="last") String lastName
    ) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userService.addUser(user);
        return user;
    }
}
