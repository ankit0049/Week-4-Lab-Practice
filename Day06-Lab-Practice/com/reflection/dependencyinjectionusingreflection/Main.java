package com.reflection.dependencyinjectionusingreflection;

// Main class to demonstrate Dependency Injection using Reflection
public class Main {
	public static void main(String[] args) {
		// Creating an instance of UserService
		UserService userService = new UserService();

		// Injecting dependencies dynamically using the DIContainer
		DIContainer.injectDependencies(userService);

		// Calling a method from UserService to verify dependency injection
		userService.performAction();
	}
}
