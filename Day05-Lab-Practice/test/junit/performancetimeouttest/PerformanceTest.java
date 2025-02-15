package junit.performancetimeouttest;

import static org.junit.jupiter.api.Assertions.*;

import com.junit.performancetimeout.PerformanceTimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

public class PerformanceTest {
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS) // Setting a max execution time.
    void testLongRunningTask() {
        // Creating a object of PerformanceTimeout
        PerformanceTimeout obj = new PerformanceTimeout();
        // This test should fail because the method takes longer than 2 seconds.
        obj.longRunningTask();
    }
}
