package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.Proxy;

public class Main {
	public static void main(String[] args) {
		// Creating an instance of the original Greeting implementation
		Greeting realGreeting = new GreetingImplentation();

		// Creating a dynamic proxy for the Greeting interface
		Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
			   Greeting.class.getClassLoader(),
			   new Class[]{Greeting.class},
			   new LoggingProxyHandler(realGreeting)
		);

		// Calling the method via proxy (logs method name before execution)
		String message = proxyGreeting.sayHello("Ankit Rajput");

		// Printing the returned greeting message
		System.out.println(message);
	}
}
