package com.user.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("The User is not available with id "+ id);
    }
}
