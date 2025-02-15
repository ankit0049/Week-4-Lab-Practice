package junit.calculatorclasstest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.calculatorclass.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    // Creating an instance of Calculator to use in tests.
    private final Calculator calculator = new Calculator();

    // Creating a test Method for addition
    @Test
    void testAddition() {
        // Checking if adding two positive numbers gives the correct result.
        assertEquals(10, calculator.add(5, 5));

        // Checking addition of negative numbers.
        assertEquals(-5, calculator.add(-3, -2));
    }


    // Creating a test Method for Subtraction
    @Test
    void testSubtraction() {
        // testing weather expected and actual result match or not
        assertEquals(3, calculator.subtract(8, 5));

        // testing when the second number is larger (result should be negative).
        assertEquals(-5, calculator.subtract(5, 10));
    }

    @Test
    void testMultiplication() {
        // Checking multiplication of two positive numbers.
        assertEquals(20, calculator.multiply(4, 5));

        // Multiplication with zero should always return zero.
        assertEquals(0, calculator.multiply(7, 0));

        // Checking multiplication of a positive and a negative number.
        assertEquals(-15, calculator.multiply(3, -5));

        // Checking multiplication of two negative numbers (result should be positive).
        assertEquals(25, calculator.multiply(-5, -5));
    }

    @Test
    void testDivision() {
        // Checking division of two positive numbers.
        assertEquals(5, calculator.divide(10, 2));

        // Verifying division where the result is not a whole number (integer division).
        assertEquals(2, calculator.divide(5, 2)); // Should truncate decimal part.

        // Checking division of a negative by a positive number.
        assertEquals(-4, calculator.divide(-8, 2));

        // Checking division of two negative numbers (should be positive).
        assertEquals(3, calculator.divide(-9, -3));
    }

    @Test
    void testDivisionByZero() {
        //Testing weather dividing by 0 number throw exception or not
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));

        // testing the equality of the actual and expected message
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
