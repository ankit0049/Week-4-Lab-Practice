package junit.userregistrationtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.userregistration.UserRegistration;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    // Creating final instance of the  user registration class named as registration
    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        // Testing weather the given mail is valid or not
        assertTrue(registration.registerUser("AnkitRajput", "ankitrajput@example.com", "Ankit123"));
    }

    @Test
    void testInvalidEmail() {
        //Testing on Invalid mail and check weather we get the expected exception or not
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("naman", "invalid-email", "naman123"));
    }

    @Test
    void testShortPassword() {
        //testing weather method works as expected on short password
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Ankit", "ankit@example.com", "123"));
    }
}
