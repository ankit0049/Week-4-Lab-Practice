package reflection.accessprivatefieldtest;

import com.reflection.accessprivatefield.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

class PrivateFieldAccessTest {

    @Test
    void testPrivateFieldModification() {
        try {
            // Creating a Person object with age 21
            Person person = new Person(25);

            // Accessing and modifying the private field "age"
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 30);

            // Verifying the modified value
            assertEquals(30, ageField.get(person), "Age should be modified to 30");

        } catch (Exception e) {
            fail("Reflection failed to access or modify the private field");
        }
    }
}
