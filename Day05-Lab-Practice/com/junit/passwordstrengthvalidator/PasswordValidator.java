package com.junit.passwordstrengthvalidator;

public class PasswordValidator {

    // Checks if the password meets the required strength criteria.
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false; // Password must be at least 8 characters long.
        }
        boolean hasUpperCase = false, hasDigit = false;
        
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        
        return hasUpperCase && hasDigit; // Must contain at least one uppercase letter and one digit.
    }
}
