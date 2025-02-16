package regex.extractcurrencyvaluefromtexttest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractcurrencyvaluesfromtext.CurrencyExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class CurrencyExtractorTest {

    @Test
    void testExtractCurrencyValues() {
        // Input text containing currency values
        String text = "The price is $45.99, and the discount is 10.50.";

        // Expected output list
        List<String> expected = List.of("$45.99", "10.50");

        // Actual result from the method
        List<String> actual = CurrencyExtractor.extractCurrencyValues(text);

        // Checking if the extracted list matches the expected list
        assertEquals(expected, actual, "Extracted currency values should match expected ones.");

        System.out.println("All tests passed!");
    }
}
