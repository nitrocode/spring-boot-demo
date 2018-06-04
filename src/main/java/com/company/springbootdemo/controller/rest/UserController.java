package com.company.springbootdemo.controller.rest;

import com.company.springbootdemo.data.model.User;
import com.company.springbootdemo.service.UserService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    UserService userService;

    private static final SimpleDateFormat BIRTHDAY_TEXT_FORMAT = new SimpleDateFormat("yyyyMMdd");

    @RequestMapping(value="/new", method=RequestMethod.POST)
    public User add(
        @RequestParam(value="first") String firstName,
        @RequestParam(value="last") String lastName,
        @RequestParam(value="birthday", required=false) String birthdayText
    ) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        if (birthdayText != null) {
            try {
                user.setBirthday(BIRTHDAY_TEXT_FORMAT.parse(birthdayText));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        userService.addUser(user);
        return user;
    }

    @RequestMapping(value="/new", method=RequestMethod.PUT)
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    @RequestMapping(
        path="/picture/{userId}",
        method=RequestMethod.PUT,
        consumes={"image/jpeg"}
    )
    public String picture(@PathVariable("userId") int userId, @RequestBody byte[] bytes) {
        return "User ID: " + userId + " uploaded " + bytes.length + " bytes";
    }

    @RequestMapping(value="get/{id}")
    public User getUser(@PathVariable("id") long id) {
        return userService.getUser(id);
    }
}
