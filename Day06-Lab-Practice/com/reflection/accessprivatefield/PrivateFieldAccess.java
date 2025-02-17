package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

// Defining the main class to access and modify the private field
public class PrivateFieldAccess {
	public static void main(String[] args) {
		try {
			// Creating an instance of the Person class
			Person person = new Person(25);

			// Retrieving the Field object for the private field "age"
			Field ageField = Person.class.getDeclaredField("age");

			// Making the field accessible
			ageField.setAccessible(true);

			// Modifying the value of the private field
			ageField.set(person, 30);

			// Retrieving and printing the modified value
			System.out.println("Modified Age: " + ageField.get(person));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
