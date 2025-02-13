package queueinterfaceproblemstest;

import com.queueinterface.reversequeue.ReverseQueue;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseQueueTest {

    @Test
    public void testReverseQueue() {
        // Initialize queue with elements
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        // Expected output after reversal
        Queue<Integer> expectedQueue = new LinkedList<>(Arrays.asList(30, 20, 10));

        // Call the reverse function
        ReverseQueue.reverseQueue(queue);

        // Verify if queue is reversed correctly
        assertEquals(expectedQueue, queue, "Queue should be reversed correctly");

        System.out.println("Queue reversed successfully");
    }
}
