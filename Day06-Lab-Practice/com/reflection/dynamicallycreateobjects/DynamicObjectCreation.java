package com.reflection.dynamicallycreateobjects;
import java.lang.reflect.Constructor;

// Defining the main class to demonstrate object creation using Reflection
public class DynamicObjectCreation {
	public static void main(String[] args) {
		try {
			// Retrieving the Class object for the Student class
			Class<?> studentClass = Class.forName("com.reflection.dynamicallycreateobjects.Student");

			// Retrieving the default constructor of the Student class
			Constructor<?> constructor = studentClass.getDeclaredConstructor();

			// Creating an instance of Student using the constructor
			Object studentObject = constructor.newInstance();

			// Casting the object to Student type
			Student student = (Student) studentObject;

			// Displaying the student details
			student.display();

		} catch (Exception e) {
			// Handling potential exceptions related to Reflection
			e.printStackTrace();
		}
	}
}
