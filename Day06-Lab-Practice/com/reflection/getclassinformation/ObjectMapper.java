package com.reflection.getclassinformation;

import java.lang.reflect.Field;
import java.util.Map;

// Defining the ObjectMapper class for object mapping
public class ObjectMapper {
	// Defining a generic method to map properties to an object
	public static <T> T toObject(Class<T> temp, Map<String, Object> properties) {
		try {
			// Creating an instance of the given class
			T obj = temp.getDeclaredConstructor().newInstance();

			// Iterating through the provided properties
			for (Map.Entry<String, Object> entry : properties.entrySet()) {
				// take the field of the property key
				Field field = temp.getDeclaredField(entry.getKey());

				// Making the field accessible
				field.setAccessible(true);

				// Setting the value of the field using reflection
				field.set(obj, entry.getValue());
			}

			// Returning the populated object
			return obj;

		}
		catch (Exception e) {
			throw new RuntimeException("Error mapping object", e);
		}
	}

	public static void main(String[] args) {
		// Creating a map of properties
		Map<String, Object> properties = Map.of("name", "Ankit Rajput", "age", 21);

		// Converting the map to a User object
		User user = toObject(User.class, properties);

		// Displaying the mapped object's data
		user.display();
	}
}
