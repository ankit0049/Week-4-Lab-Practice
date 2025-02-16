package regex.extractallcapitalizewordfromsentencetest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractallcapitalizedwordsfromsentence.CapitalizedWordsExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class CapitalizedWordsExtractorTest {

    // Method to test the extraction of capitalized words from a given text
    @Test
    void testExtractCapitalizedWords() {
        // Input text containing capitalized words
        String text = "my Name is Ankit rajput and what's your name";

        // Expected extracted capitalized words
        List<String> expected = List.of("Name", "Ankit");

        // Actual result from the method
        List<String> actual = CapitalizedWordsExtractor.extractCapitalizedWords(text);

        // Checking if extracted words match the expected list
        assertEquals(expected, actual, "Extracted capitalized words should match expected ones.");
    }


}
