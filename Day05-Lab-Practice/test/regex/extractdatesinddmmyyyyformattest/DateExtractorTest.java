package regex.extractdatesinddmmyyyyformattest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractdatesinddmmyyyyformat.DateExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class DateExtractorTest {
   // Method to test the Extract Dates in dd-mm-yyyy format
    @Test
    void testExtractDates() {
        // Input text containing dates for test and extract dates
        String text = "The events are on 27/12/2003, 15/12/2025, and 29/01/2029.";

        // Expected output list
        List<String> expected = List.of("27/12/2003", "15/12/2025", "29/01/2029");

        // Actual result from the method
        List<String> actual = DateExtractor.extractDates(text);

        // Checking if the extracted list matches the expected list
        assertEquals(expected, actual, "Extracted dates should match the expected ones.");

        System.out.println("All test cases passed.");
    }

}
