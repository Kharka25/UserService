package com.bookish.service;

import com.bookish.model.User;

public class UserService implements UserServiceInterface {
    @Override
    public User createUser(String firstName, String lastName, String email, String password, String repeatPassword) {
        return new User();
    }
}
