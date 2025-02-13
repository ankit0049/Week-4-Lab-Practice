package queueinterfaceproblemstest;

import com.queueinterface.circularbuffersimulations.CircularBuffer;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularBufferTest {

    @Test
    public void testCircularBufferOperations() {
        // Create a circular buffer with a fixed capacity of 3
        CircularBuffer cb = new CircularBuffer(3);

        // Enqueue three elements into the buffer
        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);

        // Verify the buffer contains the expected elements
        assertEquals(List.of(1, 2, 3), cb.getBuffer(), "Initial buffer no matched!");

        // Enqueue one more element (4), which should override the first inserted element (1)
        cb.enqueue(4);

        // Expected state after override: [2, 3, 4]
        assertEquals(List.of(2, 3, 4), cb.getBuffer(), "Buffer override behavior unsuccessful");
        System.out.println("Successfully passed the test!");
    }
}
