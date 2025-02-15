package junit.listoperationtest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.listoperation.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    // Creating an object of ListManager class for testing.
    private final ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        // Create a list to test
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);

        // Checking the element is successfully added to the list.
        assertTrue(list.contains(5));

        // Checking if adding multiple elements works as expected.
        listManager.addElement(list, 10);
        listManager.addElement(list, 15);
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveElement() {

        // Creating a list to test
        List<Integer> list = new ArrayList<>();

        // adding 10 element to the list
        list.add(10);

        // Create a variable that contains true or false weather remove ot not
        boolean removed = listManager.removeElement(list, 10);

        // Testing weather the element successfully deleted
        assertTrue(removed);

        //  Testing weather non-existing element status giving correctly or not
        assertFalse(listManager.removeElement(list, 20));
    }

    @Test
    void testGetSize() {
        // Created a list to test the size of the list method works fine
        List<Integer> list = new ArrayList<>();

        // adding element in the list
        list.add(1);
        list.add(2);

        // Checking if the size method correctly counts elements.
        assertEquals(2, listManager.getSize(list));

        // testing waether empty list returning 0 size
        list.clear();
        assertEquals(0, listManager.getSize(list));
    }
}
