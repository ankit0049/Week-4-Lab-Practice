package com.reflection.dependencyinjectionusingreflection;

// Class representing a Database Service
public class DatabaseService {
	// Constructor to initialize the DatabaseService object
	public DatabaseService() {
		System.out.println("DatabaseService Initialized.");
	}

	// Method to simulate database connection
	public void connect() {
		System.out.println("Connected to Database.");
	}
}
