package setinterfaceproblemstest;

import com.setinterfaceproblems.convertsettosortedlist.SetToSortedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetToSortedListTest {

    @Test
    public void testConvertToSortedList() {
        // Given set of integers
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(85, 3, 79, 197));

        // Expected sorted list
        List<Integer> expectedList = Arrays.asList(3, 79, 85, 197);

        // Convert set to sorted list
        List<Integer> actualList = SetToSortedList.convertToSortedList(inputSet);

        // Validate sorted order
        assertEquals(expectedList, actualList, "Sorting failed!");
        System.out.println("Set to sorted list conversion successful!");
    }
}