package reflection.dynamicallycreateobjectstest;

import com.reflection.dynamicallycreateobjects.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;

class DynamicObjectCreationTest {

    @Test
    void testDynamicObjectCreation() {
        try {
            // Given: Getting the Class object for Student
            Class<?> studentClass = Class.forName("com.reflection.dynamicallycreateobjects.Student");

            // When: Retrieving and using the default constructor
            Constructor<?> constructor = studentClass.getDeclaredConstructor();
            Object studentObject = constructor.newInstance();

            // Then: Verifying the object is created successfully
            assertNotNull(studentObject, "Student object should be created");

            // Checking if the object is an instance of Student
            assertTrue(studentObject instanceof Student, "Object should be an instance of Student");

            // Casting to Student and verifying default values
            Student student = (Student) studentObject;

            // Accessing directly might require making fields public
            assertEquals("Default Name", student.name);
            assertEquals(18, student.age);

        } catch (Exception e) {
            fail("Reflection failed to create an object dynamically");
        }
    }
}
