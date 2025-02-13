package listinterfaceproblemstest;

import com.listinterfaceproblems.findfrequencyofelements.FindFrequency;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindfrequencyofelementsTest {
    @Test
    public void testOfFindfrequencyofelements() {
        Map<String , Integer> expectedMap = new HashMap<>();
	   List<String> inputList = List.of("Ankit" , "Rajput" , "Abhishek" , "Rajput" , "Ankit" , "Jat" , "Pandey");

	   for(String str : inputList){
		  expectedMap.put(str , expectedMap.getOrDefault(str , 0) + 1);
	   }

	   Map<String , Integer> resultMap = FindFrequency.findFrequency(inputList);

	   Assertions.assertEquals(expectedMap , resultMap , "Map should be equal to pass the test");

    }
}
