package com.bookish.service;

import com.bookish.model.User;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {
    @Test
     void shouldCreateNewUserWhenUserDetailsAreProvided() {
        UserService userService = new UserService();

        String firstName = "Kharka";
        String lastName = "Kay";
        String email = "kkay@mail.com";
        String password = "123456";
        String repeatPassword = "123456";

        User user = userService.createUser(firstName, lastName, email, password, repeatPassword);

        assertNotNull(user, "createUser method should not return null");
    }
}
