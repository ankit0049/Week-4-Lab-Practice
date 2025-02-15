package com.regex.validateusername;

import java.util.regex.Pattern;

// Class responsible for username validation
public class UsernameValidator {
	// Create a Method to validate if the given username meets the required conditions
	public static boolean isValidUsername(String username) {
		/* Regular expression pattern:
		   ^[a-zA-Z]       -> Ensures the username starts with a letter
		   [a-zA-Z0-9_]{4,14}$ -> Allows letters, numbers, and underscores
		*/
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

		// Compiling the regex pattern and matching it with the input username
		return Pattern.matches(regex, username);
	}

	public static void main(String[] args) {
		// Defining test usernames for the testing
		String[] testUsernames = {"ankit_123", "123ankit", "an", "Ankit_1", "AnkitSinghRajpootTooLong123"};

		// Iterating over test usernames and validating each one
		for (String username : testUsernames) {
			// Checking if the username is valid and printing the result
			if (isValidUsername(username)) {
				System.out.println(username + " is Valid");
			}
			else {
				System.out.println(username + " is Invalid");
			}
		}
	}
}
