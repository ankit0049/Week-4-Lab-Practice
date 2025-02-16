package regex.censorbadwordsinsentence;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.censorbadwordsinsentence.CensorWords;
import org.junit.jupiter.api.Test;

class CensorWordsTest {

    @Test
    void testCensorBadWords() {
        // Input text with bad words
        String text = "This is a damn bad example with some stupid words.";


        // List of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Expected censored output
        String expected = "This is a **** bad example with some **** words.";

        // Actual result from the method
        String actual = CensorWords.censorBadWords(text, badWords);

        // Checking if the censored text matches the expected output
        assertEquals(expected, actual, "The bad words should be replaced with ****.");

        // Input text with mixed-case bad words
        text = "This is a DAMN bad example with some StuPid words.";


        // Actual result from the method
        actual = CensorWords.censorBadWords(text, badWords);

        // Checking if case-insensitive words are censored correctly
        assertEquals(expected, actual, "The function should be case insensitive.");

        System.out.println("Censor Words Test passed. All assertions are true.");
    }

}