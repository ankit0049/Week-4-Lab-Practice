package reflection.dynamicmethodinvocationtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

class DynamicMethodInvokerTest {
    @Test
    void testAddMethodInvocation() throws Exception {
        // Getting the Class object for MathOperations
        Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");

        // Creating an instance dynamically
        Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

        // Retrieving and invoking the "add" method dynamically
        Method addMethod = mathClass.getMethod("add", int.class, int.class);
        Object result = addMethod.invoke(mathInstance, 5, 3);

        // Then: Verifying the result
        assertEquals(8, result);
    }

    @Test
    void testSubtractMethodInvocation() throws Exception {
        // Given
        Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
        Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

        // When
        Method subtractMethod = mathClass.getMethod("subtract", int.class, int.class);
        Object result = subtractMethod.invoke(mathInstance, 10, 4);

        // Then
        assertEquals(6, result);
    }

    @Test
    void testMultiplyMethodInvocation() throws Exception {
        // Given
        Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
        Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

        // When
        Method multiplyMethod = mathClass.getMethod("multiply", int.class, int.class);
        Object result = multiplyMethod.invoke(mathInstance, 3, 7);

        // Then
        assertEquals(21, result);
    }

    @Test
    void testInvalidMethodInvocation() {
        // Given
        Exception exception = assertThrows(Exception.class, () -> {
            Class<?> mathClass = Class.forName("com.reflection.dynamicmethodinvocation.MathOperations");
            Object mathInstance = mathClass.getDeclaredConstructor().newInstance();

            // Trying to invoke a non-existing method
            Method invalidMethod = mathClass.getMethod("divide", int.class, int.class);
            invalidMethod.invoke(mathInstance, 10, 2);
        });

        assertTrue(exception.getMessage().contains("divide"));
    }
}
