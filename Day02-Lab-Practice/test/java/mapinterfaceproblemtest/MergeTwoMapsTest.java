package mapinterfaceproblemtest;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.mapinterface.mergetwomaps.MergeTwoMaps.mergeMaps;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoMapsTest {

    @Test
    public void testMergeMaps() {
	   // Creating first map with key-value pairs
	   Map<String, Integer> map1 = new HashMap<>();
	   map1.put("A", 1);
	   map1.put("B", 2);

	   // Creating second map with key-value pairs
	   Map<String, Integer> map2 = new HashMap<>();
	   map2.put("B", 3);
	   map2.put("C", 4);

	   // Expected output after merging
	   Map<String, Integer> expectedMap = new HashMap<>();
	   expectedMap.put("A", 1);
	   expectedMap.put("B", 5);
	   expectedMap.put("C", 4);

	   // Calling mergeMaps() and asserting equality
	   Map<String, Integer> actualMap = mergeMaps(map1, map2);
	   assertEquals(expectedMap, actualMap, "Merged map does not match expected result");
    }
}
