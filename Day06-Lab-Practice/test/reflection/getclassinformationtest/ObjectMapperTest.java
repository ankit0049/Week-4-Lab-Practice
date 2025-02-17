package reflection.getclassinformationtest;

import com.reflection.getclassinformation.ObjectMapper;
import com.reflection.getclassinformation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

class ObjectMapperTest {

    @Test
    void testToObjectMapping() {
        // Provide key and value map with user properties
        Map<String, Object> properties = Map.of("name", "Ankit Rajput", "age", 21);

        // converting to a User object
        User user = ObjectMapper.toObject(User.class, properties);

        //verifying the mapped values
        assertNotNull(user, "User object should not be null");

        // Using Reflection to check private field values
        try {
            // Accessing private fields
            var nameField = User.class.getDeclaredField("name");
            var ageField = User.class.getDeclaredField("age");
            nameField.setAccessible(true);
            ageField.setAccessible(true);

            // Asserting field values and test weather output matched with expected
            assertEquals("Ankit Rajput", nameField.get(user), "Name should be correctly mapped");
            assertEquals(21, ageField.get(user), "Age should be correctly mapped");

        } catch (Exception e) {
            fail("Reflection failed to access private fields");
        }
    }
}
