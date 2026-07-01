package com.shobhit.jpapractice.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("User Not found with id " + id);
    }
}
