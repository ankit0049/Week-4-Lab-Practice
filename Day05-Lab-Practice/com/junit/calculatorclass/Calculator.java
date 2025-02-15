package com.junit.calculatorclass;
public class Calculator {

    // Adds two integers and returns their sum.
    // This method performs simple addition.
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts the second number from the first number.
    // If a < b, the result will be negative.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers and returns the product.
    // Works for both positive and negative numbers.
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides the first number by the second number.
    // Throws an exception if division by zero is attempted.
    public int divide(int a, int b) {
        if (b == 0) {
            // Division by zero is mathematically undefined, so we explicitly prevent it.
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
