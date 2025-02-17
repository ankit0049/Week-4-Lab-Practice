package reflection.methodexecutiontimingtest;

import com.reflection.methodexecutiontiming.MethodTimer;
import com.reflection.methodexecutiontiming.TestClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MethodTimerTest {

    @Test
    void testQuickMethodExecutionTime() {
        // Given: An instance of TestClass
        TestClass testInstance = new TestClass();

        // When: Measure execution time for quickMethod
        // Using System's current time to check the expected output manually
        long startTime = System.nanoTime();
        MethodTimer.executeWithTiming(testInstance, "quickMethod");
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;

        // Then: The execution time should be less than a reasonable threshold
        // Since it's a quick method, we expect the time to be small
        assertTrue(executionTime < 10, "Execution time of quickMethod should be less than 10ms.");
    }

    @Test
    void testSlowMethodExecutionTime() {
        // Given: An instance of TestClass
        TestClass testInstance = new TestClass();

        // When: Measure execution time for slowMethod
        long startTime = System.nanoTime();
        MethodTimer.executeWithTiming(testInstance, "slowMethod");
        long endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000000.0;

        // Then: The execution time should be greater than a reasonable threshold
        assertTrue(executionTime > 500, "Execution time of slowMethod should be greater than 500ms.");
    }

    @Test
    void testInvalidMethod() {
        // Given: An instance of TestClass
        TestClass testInstance = new TestClass();

        // When: Attempting to execute a non-existent method
        // Then: Expect an error message or exception handling from MethodTimer
        try {
            MethodTimer.executeWithTiming(testInstance, "nonExistentMethod");
            fail("MethodTimer should throw an error for non-existent methods.");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("Error"), "Expected an error message when calling a non-existent method.");
        }
    }
}
