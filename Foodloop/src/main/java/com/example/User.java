package com.example;

public class User {
    private String username;
    private String email;

    // Constructor
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}