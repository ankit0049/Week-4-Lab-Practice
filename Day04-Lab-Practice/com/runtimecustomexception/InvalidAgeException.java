package com.runtimecustomexception;

import java.util.*;

// Defining a custom exception for invalid age
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class AgeValidation {
    public static void main(String[] args) {
        // Calling the method to validate age
        checkUserAge(0);
    }
    // Method to take user input and validate age
    public static int checkUserAge(int number) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        try {
            // Asking the user for age input
            System.out.println("Enter age:");
            int age;
            if(number != 1) {
                 age = sc.nextInt();
            }else{
                age = number;
            }

            // Calling the method to validate age
            validateAge(age);

            // Printing access granted message if no exception occurs
            System.out.println("Access granted!");
            return age;
        } catch (InvalidAgeException e) {
            // Handling custom exception when age is below 18
            System.out.println("Age must be 18 or above.");
        } catch (InputMismatchException e) {
            // Handling non-numeric input
            System.out.println("Invalid input! Please enter a valid age.");
        } finally {
            // Closing the Scanner object
            sc.close();
        }
        return -1;
    }

    // Method to validate age and throw custom exception if below 18
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}
