package reflection.generatejsonrepresentationtest;

import com.reflection.accessprivatefield.Person;
import com.reflection.generatejsonrepresentation.JsonConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonConverterTest {

    @Test
    void testToJson() {
        // Given: Create an instance of the Person class
        Person person = new Person( 25);

        // When: Convert the object to JSON format
        String jsonOutput = JsonConverter.toJson(person);

        // Then: Verify the generated JSON-like string
        assertNotNull(jsonOutput, "The JSON output should not be null.");
        assertTrue(jsonOutput.contains("\"age\": 25"), "The JSON should contain the age field with the correct value.");
        assertTrue(jsonOutput.startsWith("{") && jsonOutput.endsWith("}"), "The JSON string should start with '{' and end with '}'.");
    }

    @Test
    void testToJsonWithNullObject() {
        // Given: A null object
        Person person = null;

        // Convert the null object to JSON format
        String jsonOutput = JsonConverter.toJson(person);


        // Verify the output is "null"
        assertEquals("null", jsonOutput, "The JSON output for a null object should be 'null'.");
    }
}
