package annoations.deprecatedtest;

import com.annotations.deprecated.LegacyAPI;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeprecatedExampleTest {

    @Test
    public void testOfDeprecatedMethod() {
	   // Create an object to make use of the deprecated method
	   LegacyAPI object  = new LegacyAPI();

	   // Call the deprecated method
	   String actualResult = object.oldFeature();

	   // Assert that the method returns the expected result
	   assertTrue(actualResult.equals("Old Feature"));

    }
}
