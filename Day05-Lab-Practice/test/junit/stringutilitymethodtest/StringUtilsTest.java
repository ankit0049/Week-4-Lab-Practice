package junit.stringutilitymethodtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.stringutilitymethod.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    // Creating an instance of StringUtils for testing diffrent methods.
    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverse() {
        // testing weather the reverse method correctly reverses a string.
        assertEquals("Ankit", stringUtils.reverse("tiknA"));

        // Ensuring an empty string remains unchanged after reversal.
        assertEquals("", stringUtils.reverse(""));

        // testing weather reversing a null string returns null.
        assertNull(stringUtils.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        // testing isPalindrome method correctly checking a string palindrome
        assertTrue(stringUtils.isPalindrome("naman"));

        // Testing an empty string, which should also be considered a palindrome.
        assertTrue(stringUtils.isPalindrome(""));

        // Checking that a non-palindromic word is identified correctly.
        assertFalse(stringUtils.isPalindrome("Ankit"));
    }

    @Test
    void testToUpperCase() {
        // Testing weather the  given string correctly converted to uppercase or not.
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));

        // Testing an already uppercase string remains same.
        assertEquals("WORLD", stringUtils.toUpperCase("WORLD"));

        // testing that a null input returns null.
        assertNull(stringUtils.toUpperCase(null));
    }
}
