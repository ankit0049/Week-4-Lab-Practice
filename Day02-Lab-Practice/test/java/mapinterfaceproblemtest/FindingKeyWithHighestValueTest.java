package mapinterfaceproblemtest;

import com.mapinterface.findingkeywithhighestvalue.MaxValueKeyFinder;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindingKeyWithHighestValueTest {
    @Test
    public void testFindingKeyWithHighestValue(){
	   Map<String, Integer> input = new HashMap<>();
	   input.put("A", 10);
	   input.put("B", 20);
	   input.put("C", 15);

	   int maximumValue = 20;
	   String expectedKey = "B";

	   String actualKey = MaxValueKeyFinder.findMaxKey(input);
	   assertEquals(expectedKey, actualKey);
    }
}
