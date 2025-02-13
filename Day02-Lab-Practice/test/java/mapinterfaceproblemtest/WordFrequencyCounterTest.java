package mapinterfaceproblemtest;

import org.junit.Test;

import java.util.Map;

import static com.mapinterface.wordfrequencycounter.WordFrequencyCounter.countWordFrequency;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyCounterTest {
    @Test
    public void testCountWordFrequency() {
	   // Input string with duplicate words
	   String input = "ankit rajput, vinay rajput, ankit rajput, !";

	   // Expected word frequency map
	   Map<String, Integer> expected = Map.of(
			 "ankit", 2,
			 "rajput", 3,
			 "vinay", 1
	   );

	   // Call the method and compare with expected result
	   assertEquals(expected, countWordFrequency(input), "Word frequency count mismatch");
    }

}
