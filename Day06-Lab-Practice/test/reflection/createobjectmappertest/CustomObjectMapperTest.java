package reflection.createobjectmappertest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CustomObjectMapperTest {

    @Test
    void testToObject() {
        // Given: Prepare the map with field data
        Map<String, Object> personData = new HashMap<>();
        personData.put("name", "Ankit");
        personData.put("age", 25);

        // When: Using the CustomObjectMapper to create and populate a Person object
        Person person = CustomObjectMapper.toObject(Person.class, personData);

        // Then: Verify the populated object's field values
        assertNotNull(person, "The Person object should not be null.");
        assertEquals("Ankit", person.getName(), "The name should be 'Ankit'.");
        assertEquals(25, person.getAge(), "The age should be 25.");
    }
}

class Person {
    // Declaring private fields
    private String name;
    private int age;

    // Default constructor (needed for Reflection-based instantiation)
    public Person() {
    }

    // Getters for testing
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display object details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class CustomObjectMapper {
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
