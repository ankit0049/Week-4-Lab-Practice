package regex.findrepeatingwordsinsentencetest;

import static org.junit.jupiter.api.Assertions.*;
import com.regex.findrepeatingwordsinsentence.RepeatingWordFinder;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

public class RepeatingWordFinderTest {

    @Test
    void testFindRepeatingWords() {
        // Test case with repeating words
        String input1 = "This is is a repeated repeated word test.";
        Set<String> expected1 = Set.of("is", "repeated");
        assertEquals(expected1, RepeatingWordFinder.findRepeatingWords(input1));

        // Test case with no repeating words
        String input2 = "No repetition here.";
        Set<String> expected2 = Set.of();
        assertEquals(expected2, RepeatingWordFinder.findRepeatingWords(input2));

        // Test case with multiple repeating words
        String input3 = "one one two two three three";
        Set<String> expected3 = Set.of("one", "two", "three");
        assertEquals(expected3, RepeatingWordFinder.findRepeatingWords(input3));
    }
}
