package com.reflection.customloggingproxyusingreflection;

// Implementing the Greeting interface
public class GreetingImplentation implements Greeting {
	// Method to return a greeting message
	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}
}
