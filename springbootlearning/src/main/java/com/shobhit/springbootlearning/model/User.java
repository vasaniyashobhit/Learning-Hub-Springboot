package com.shobhit.springbootlearning.model;


public class User {

    String username;
    String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
        System.out.println("User created: " + username);
    }
}
