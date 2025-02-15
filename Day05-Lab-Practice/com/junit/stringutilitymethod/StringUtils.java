package com.junit.stringutilitymethod;

public class StringUtils {

    // create a method to Reverses a given string.
    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    // Created a isPalindrome method to Checks whether a string is a palindrome.
    public boolean isPalindrome(String str) {
        // Null is not a valid palindrome.
        if (str == null) return false;
        return str.equals(reverse(str));
    }

    // Create a method to Converts a given string to uppercase.
    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
