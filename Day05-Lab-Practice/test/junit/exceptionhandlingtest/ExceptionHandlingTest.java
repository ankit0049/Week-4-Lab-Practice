package junit.exceptionhandlingtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.exceptionhandling.ExceptionHandling;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    // Creating an object of the class for testing.
    private final ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Test
    void testValidDivision() {
        // Checking a valid division case where result should be an integer.
        assertEquals(5, exceptionHandling.divide(10, 2));

        // Confirming a division where result is truncated (integer division).
        assertEquals(3, exceptionHandling.divide(7, 2));
    }

    @Test
    void testDivisionByZero() {
        // Ensuring that an ArithmeticException is thrown when dividing by zero.
        Exception exception = assertThrows(ArithmeticException.class, () -> exceptionHandling.divide(10, 0));

        // Checking if the exception message is as expected.
        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
