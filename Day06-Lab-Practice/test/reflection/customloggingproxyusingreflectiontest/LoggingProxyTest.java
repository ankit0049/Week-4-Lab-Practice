package reflection.customloggingproxyusingreflectiontest;

import com.reflection.customloggingproxyusingreflection.Greeting;
import com.reflection.customloggingproxyusingreflection.GreetingImplentation;
import com.reflection.customloggingproxyusingreflection.LoggingProxyHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoggingProxyTest {

    @Test
    void testLoggingProxy() {
        // Given: Create an instance of the real Greeting implementation
        Greeting realGreeting = new GreetingImplentation();

        // Create a proxy for the Greeting interface with LoggingProxyHandler
        Greeting proxyGreeting = (Greeting) java.lang.reflect.Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realGreeting)
        );

        // Call the method via the proxy
        String message = proxyGreeting.sayHello("Ankit Rajput");

        // Verify that the message is correctly returned
        assertNotNull(message, "The greeting message should not be null.");
        assertEquals("Hello, Ankit Rajput!", message, "The greeting message should be 'Hello, Ankit Rajput!'.");

        // Optionally, verify if the method was logged (if using a custom logging framework)
        // This can be checked by mocking or intercepting the console output in a more advanced test.
    }

    @Test
    void testLoggingProxyMethodCall() {
        // Given: Create an instance of the real Greeting implementation
        Greeting realGreeting = new GreetingImplentation();

        // When: Create a proxy for the Greeting interface
        Greeting proxyGreeting = (Greeting) java.lang.reflect.Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(realGreeting)
        );

        // Call the method via the proxy (method name will be logged)
        proxyGreeting.sayHello("John");

        // Then: We don't check the output here, but we expect that the proxy logs the method name
        // The actual logging verification would depend on capturing stdout, which can be complex and might require a logging framework
    }
}
