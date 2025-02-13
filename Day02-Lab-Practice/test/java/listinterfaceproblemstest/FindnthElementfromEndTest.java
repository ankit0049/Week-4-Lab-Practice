package listinterfaceproblemstest;

import com.listinterfaceproblems.findnthelementfromend.FindNthFromEnd;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindnthElementfromEndTest {
    @Test
    public void testFindnthElementfromEnd() {
	   // Create a LinkedList of characters
	   LinkedList<Character> list = new LinkedList<>(Arrays.asList('R', 'A', 'J', 'P', 'U' , 'T'));

	   // Create a expected variable and store the expected output
	   Character expected = 'P';

	   // Create a actual variable and store the actual output
	   Character actual = FindNthFromEnd.findNthFromEnd(list, 3);

	   // Compare the expected and actual output
	   assertEquals(expected, actual, "Test Case Failed");

    }
}
