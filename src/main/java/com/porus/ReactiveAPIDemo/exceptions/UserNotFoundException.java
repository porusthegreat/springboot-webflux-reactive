package com.porus.ReactiveAPIDemo.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(String.format("Cannot find user by: " + message));
    }
}
