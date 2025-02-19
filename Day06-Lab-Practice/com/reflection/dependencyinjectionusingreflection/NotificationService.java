package com.reflection.dependencyinjectionusingreflection;

// Class representing a Notification Service
public class NotificationService {
	// Constructor to initialize the NotificationService object
	public NotificationService() {
		System.out.println("NotificationService Initialized.");
	}

	// Method to simulate sending a notification
	public void sendNotification(String message) {
		System.out.println("Notification Sent: " + message);
	}
}
