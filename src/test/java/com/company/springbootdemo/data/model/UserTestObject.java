package com.company.springbootdemo.data.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;

public class UserTestObject {

    private User user;

    @Before
    public void setup() {
        user = new User();
        user.setFirstName("first");
        user.setLastName("last");
        user.setBirthday(new Date());
    }

    @Test
    public void getFirstName() {
        assertEquals("first", user.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("last", user.getLastName());
    }

    @Test
    public void getBirthday() {
        assertEquals(new Date(), user.getBirthday());
    }
}