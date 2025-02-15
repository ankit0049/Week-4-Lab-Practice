package com.junit.exceptionhandling;

public class ExceptionHandling {
    // Create a method to divide number if divider is 0 Throws an ArithmeticException
    public int divide(int a, int b) {
        // Checking weather divider is 0 or not
        if (b == 0) {
           // throwing an exception divide by zero
            throw new ArithmeticException("Cannot divide by zero.");
        }
        // returning the result
        return a / b;
    }
}
