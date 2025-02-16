package annoations.customserialzationannotationtest;

import com.annotations.customserializationannotation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializationTest {

    @Test
    void testJsonSerialization() {
        // Creating a test user
        User user = new User("ankit_049", "ankitrajput@example.com");

        // Generating JSON output
        String jsonOutput = user.toJson().replaceAll("\\s+", "");

        // Expected JSON in a normalized format
        String expectedJson1 = "{user_name:ankit_049,email_id:ankitrajput@example.com}";
        String expectedJson2 = "{email_id:ankitrajput@example.com,user_name:ankit_049}";

        // Checking if JSON output matches either expected order
        assertTrue(jsonOutput.equals(expectedJson1) || jsonOutput.equals(expectedJson2),
                "JSON Output does not match expected format: " + jsonOutput);
    }
}
