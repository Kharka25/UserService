package com.bookish.service;

import com.bookish.model.User;

public interface UserServiceInterface {
    User createUser(String firstName, String lastName, String email, String password, String repeatPassword);
}
