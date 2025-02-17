package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

// Defining the PrivateMethodInvoker class to invoke the private method
public class PrivateMethodInvoker {
	public static void main(String[] args) {
		try {
			// Creating an instance of Calculator
			Calculator calculator = new Calculator();

			// Retrieving the private method "multiply"
			Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

			// Making the method accessible
			multiplyMethod.setAccessible(true);

			// Invoking the method with parameters
			int result = (int) multiplyMethod.invoke(calculator, 5, 4);

			// Printing the result
			System.out.println("Multiplication Result: " + result);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
