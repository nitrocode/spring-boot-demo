package com.company.springbootdemo.data.model;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

public class UserTest {

    @Test
    public void setFirstName() {
        User fn = new User();
        fn.setFirstName("first");
        assertEquals("first", fn.getFirstName());
    }

    @Test
    public void setLastName() {
        User fn = new User();
        fn.setLastName("last");
        assertEquals("last", fn.getLastName());
    }

    @Test
    public void setBirthday() {
        Date date = new Date();
        User fn = new User();
        fn.setBirthday(date);
        assertEquals(date, fn.getBirthday());
    }
}