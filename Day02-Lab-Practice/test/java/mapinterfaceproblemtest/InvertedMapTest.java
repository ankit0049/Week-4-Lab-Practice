package mapinterfaceproblemtest;

import com.mapinterface.invertmap.InvertMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertedMapTest {
    @Test
    public void testInvertedMap() {
	   Map<String, Integer> input = new HashMap<>();
	   // Adding key-value pairs to the map
	   input.put("A", 1);
	   input.put("B", 2);
	   input.put("C", 1);

	   Map<Integer , List<String>> actualMap = InvertMap.invert(input);
	   Map<Integer , List<String>> resultMap = new HashMap<>();
	   resultMap.put(1, List.of("A", "C"));
	   resultMap.put(2, List.of("B"));

	   assertTrue(actualMap.equals(resultMap));
    }
}
