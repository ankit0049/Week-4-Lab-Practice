package queueinterfaceproblemstest;

import com.queueinterface.implementstackusingqueue.StackUsingQueues;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StackUsingQueuesTest {

    @Test
    public void testStackOperations() {
        StackUsingQueues stack = new StackUsingQueues();

        // Stack should be empty initially
        assertTrue(stack.isEmpty(), "Stack should be empty!");

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check the top element
        assertEquals(30, stack.top(), "Top element should be 30");

        // Pop elements and verify order
        assertEquals(30, stack.pop(), "Popped element should be 30");


        // Top should now be 10
        assertEquals(20, stack.top(), "Top element should be 20");

        // Pop last element
        assertEquals(20, stack.pop(), "Popped element should be 20");

        stack.pop();

        // Stack should be empty after all pops
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");

        // Accessing top of empty stack should also throw exception
        assertThrows(NoSuchElementException.class, stack::top, "Top should throw exception when stack is empty");
        System.out.println("Stack operations test passed!");
    }
}
