package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
	public static void main(String[] args) {
		try {
			// Creating a Scanner object to take user input
			Scanner sc = new Scanner(System.in);

			// Prompting the user to enter the method name
			System.out.print("Enter method name (add, subtract, multiply): ");
			String methodName = sc.nextLine();

			// Prompting the user to enter two integer values
			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();

			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();

			sc.close();

			// Retrieving the Class object for the MathOperations class
			Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");

			// Creating an instance of MathOperations dynamically
			Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

			// Retrieving the method dynamically based on the user input
			Method method = mathClass.getMethod(methodName, int.class, int.class);

			// Invoking the method dynamically with the provided arguments
			Object result = method.invoke(mathInstance, num1, num2);

			// Displaying the result of the method invocation
			System.out.println("Result: " + result);

		}
		catch (Exception e) {
			// Handling exceptions related to Reflection
			System.out.println("Error: " + e.getMessage());
		}
	}
}
