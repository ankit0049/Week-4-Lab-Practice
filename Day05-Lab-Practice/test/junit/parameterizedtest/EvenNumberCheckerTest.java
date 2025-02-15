package junit.parameterizedtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.parameterized.EvenNumberChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberCheckerTest {

    @ParameterizedTest
    // Providing multiple test inputs.
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void testIsEvenTrue(int number) {
        // All numbers in ValueSource should be correctly identified as even.
        assertTrue(evenNumberChecker.isEven(number));
    }

    private final EvenNumberChecker evenNumberChecker = new EvenNumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9}) // Providing odd numbers.
    void testIsEvenFalse(int number) {
        // Ensuring that odd numbers are correctly identified as not even.
        assertFalse(evenNumberChecker.isEven(number));
    }
}
