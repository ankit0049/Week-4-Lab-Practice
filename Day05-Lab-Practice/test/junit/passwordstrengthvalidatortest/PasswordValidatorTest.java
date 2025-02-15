package junit.passwordstrengthvalidatortest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.passwordstrengthvalidator.PasswordValidator;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        // Testing weather on given password isValidPassword working correctly or not
        assertTrue(validator.isValidPassword("Ankit123"));
    }

    @Test
    void testShortPassword() {
        // Testing weather short password accepted or not (expected output is false)
        assertFalse(validator.isValidPassword("A1nkit"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        // Checking weather given password contains a one Uppercase letter
        assertFalse(validator.isValidPassword("ankit123"));
    }

    @Test
    void testPasswordWithoutDigit() {
        // Testing password contains at least one number or not
        assertFalse(validator.isValidPassword("AnkitRajput"));
    }
}
