package queueinterfaceproblemstest;

import com.queueinterface.generatebinarynumberusingqueue.BinaryNumbersQueue;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryNumbersQueueTest {

    @Test
    public void testGenerateBinaryNumbers() {
        // Define the input number
        int n = 5;

        // Expected output for the first 5 binary numbers
        List<String> expectedBinaryNumbers = List.of("1", "10", "11", "100", "101");

        // Call the method to test
        List<String> actualBinaryNumbers = BinaryNumbersQueue.generateBinaryNumbers(n);

        // Compare expected vs actual result
        assertEquals(expectedBinaryNumbers, actualBinaryNumbers, "Binary number mismatched generation failed!");
        System.out.println("Successfully generated binary numbers all test Case passed");
    }
}
