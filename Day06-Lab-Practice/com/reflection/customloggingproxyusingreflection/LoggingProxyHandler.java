package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// Class that implements InvocationHandler to intercept method calls dynamically
public class LoggingProxyHandler implements InvocationHandler {
	// Reference to the target object being proxied
	private final Object target;

	// Constructor to initialize the target object
	public LoggingProxyHandler(Object target) {
		this.target = target;
	}

	// Overriding invoke method to intercept method calls
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// Logging the method name before execution
		System.out.println("[LOG] Method called: " + method.getName());

		// Invoking the actual method on the target object
		return method.invoke(target, args);
	}
}
