package com.reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {
	// Method to map values from a Map<String, Object> to an object of the specified class
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
		try {
			// Creating an instance of the given class using its default constructor
			T instance = clazz.getDeclaredConstructor().newInstance();

			// Iterating over the provided properties map
			for (Map.Entry<String, Object> entry : properties.entrySet()) {
				// Retrieving the field name from the map entry
				String fieldName = entry.getKey();

				// Retrieving the value to be set
				Object fieldValue = entry.getValue();

				try {
					// Getting the field from the class by name
					Field field = clazz.getDeclaredField(fieldName);

					// Making the private field accessible
					field.setAccessible(true);

					// Setting the field value dynamically
					field.set(instance, fieldValue);
				}
				catch (NoSuchFieldException e) {
					// Handling the case where a field does not exist in the class
					System.out.println("Warning: No field found with name '" + fieldName + "' in " + clazz.getSimpleName());
				}
			}

			// Returning the populated object
			return instance;

		}
		catch (Exception e) {
			// Handling any exceptions that occur during object creation or field modification
			throw new RuntimeException("Error in object mapping: " + e.getMessage());
		}
	}
}
