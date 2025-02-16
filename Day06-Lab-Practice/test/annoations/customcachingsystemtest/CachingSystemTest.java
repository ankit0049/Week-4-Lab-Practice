package annoations.customcachingsystemtest;

import com.annotations.customcachingsystem.ExpensiveOperation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CachingSystemTest {

    @Test
    void testFactorialCaching() {
        ExpensiveOperation operation = new ExpensiveOperation();

        // First execution (without cache)
        long startTime1 = System.nanoTime();
        long result1 = operation.factorial(10);
        long endTime1 = System.nanoTime();
        long timeWithoutCache = endTime1 - startTime1;

        // Second execution (with cache)
        long startTime2 = System.nanoTime();
        long result2 = operation.factorial(10);
        long endTime2 = System.nanoTime();
        long timeWithCache = endTime2 - startTime2;

        // Verify the result is the same
        assertEquals(result1, result2, "Cached and non-cached results should be the same");

        // Verify second execution is faster
        assertTrue(timeWithCache < timeWithoutCache, "Second execution should be faster due to caching");

        System.out.println("All tests passed!");
    }
}
