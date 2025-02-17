package reflection.invokeprivatemethodtest;

import com.reflection.invokeprivatemethod.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

class PrivateMethodInvokerTest {

    @Test
    void testPrivateMethodInvocation() {
        try {
            // Creating a Calculator object
            Calculator calculator = new Calculator();

            // Accessing and invoking the private method "multiply"
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);

            // Testing the expected result with actual result
            assertEquals(20, result, "Multiplication should return 20");

            System.out.println("All test Case successfully passed");

        } catch (Exception e) {
            fail("Reflection failed to invoke the private method");
        }
    }
}
