package com.reflection.dependencyinjectionusingreflection;

import java.lang.reflect.Field;

// Class that implements Dependency Injection using Reflection
public class DIContainer {
	// Method to scan and inject dependencies into the given object
	public static void injectDependencies(Object obj) {
		try {
			// Retrieving all declared fields of the class
			Field[] fields = obj.getClass().getDeclaredFields();

			// Iterating over each field to check for the @Inject annotation
			for (Field field : fields) {
				// Checking if the field is marked with @Inject annotation
				if (field.isAnnotationPresent(Inject.class)) {
					// Retrieving the type of the field (dependency class)
					Class<?> dependencyClass = field.getType();

					// Creating a new instance of the dependency class
					Object dependencyInstance = dependencyClass.getDeclaredConstructor().newInstance();

					// Making the private field accessible for modification
					field.setAccessible(true);

					// Injecting the newly created instance into the field
					field.set(obj, dependencyInstance);
				}
			}
		}
		catch (Exception e) {
			// Handling any exceptions that may occur during dependency injection
			e.printStackTrace();
		}
	}
}
