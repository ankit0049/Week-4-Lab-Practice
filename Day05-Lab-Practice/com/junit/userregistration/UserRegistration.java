package com.junit.userregistration;

public class UserRegistration {

    // Create a method Registers a user if inputs are valid.
    public boolean registerUser(String username, String email, String password) {
        // Check weather username contains character or null
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        // Throw exception if mail not contains @ symbol
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        // Throw the exception if password length is below 6
        if (password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        }
        // return the status as true because Registration successful.
        return true;
    }
}
