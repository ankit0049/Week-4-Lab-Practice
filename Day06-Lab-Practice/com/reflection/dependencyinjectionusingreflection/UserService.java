package com.reflection.dependencyinjectionusingreflection;

// Class representing a User Service that requires dependencies
public class UserService {
	// Private field for DatabaseService
	@Inject
	private DatabaseService databaseService;

	// Private field for NotificationService
	@Inject
	private NotificationService notificationService;

	// Constructor to initialize UserService object
	public UserService() {
		System.out.println("UserService Initialized.");
	}

	// Method to perform some operations
	public void performAction() {
		System.out.println("Performing User Service Actions...");

		// Calling method from DatabaseService
		databaseService.connect();

		// Calling method from NotificationService
		notificationService.sendNotification("Welcome User!");
	}
}
