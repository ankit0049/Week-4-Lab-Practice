package listinterfaceproblemstest;

import com.listinterfaceproblems.rotateelementsinlist.RotateList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotateListTest {
    @Test
    public void testofRotateList() {

	   List<Integer> list = Arrays.asList(78, 24, 14, 70, 50);
        List<Integer>expectedList = new ArrayList<>();
	   expectedList.addAll(list.subList(2, list.size()));
	   expectedList.addAll(list.subList(0 , 2));

	   // Create a rotated list to hold the rotated list result
	   List<Integer> rotatedList = RotateList.rotate(list, 2);

	   assertEquals(expectedList , rotatedList , "Rotated and expected list mismatched");
    }
}
