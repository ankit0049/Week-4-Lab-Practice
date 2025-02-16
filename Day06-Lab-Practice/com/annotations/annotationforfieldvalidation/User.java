package com.annotations.annotationforfieldvalidation;

// Defining the User class that uses @MaxLength annotation
public class User {
	// Applying the annotation with a max length restriction
	@MaxLength(10)
	private String username;

	// Defining a constructor that checks the annotation constraint
	public User(String username) {
		if (username.length() > 10) {
			throw new IllegalArgumentException("Username exceeds max length of 10 characters");
		}
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}

