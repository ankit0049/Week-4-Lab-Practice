package listinterfaceproblemstest;

import com.listinterfaceproblems.removeduplicateswhilepreservingorder.RemoveDuplicates;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
	   List<Integer> userInput = List.of(1 , 4 , 8 , 4 , 1 , 8 , 1 , 4 , 8 , 4 );
	   List<Integer> expectedResult = List.of(1, 4, 8);

	   List<Integer> actualResult = RemoveDuplicates.removeDuplicates(userInput);
	   assertTrue(actualResult.equals(expectedResult));
    }
}
