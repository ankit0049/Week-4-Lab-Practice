package annoations.annotationsforpendingtasktest;

import com.annotations.annotationforpendingtasks.Todo;
import com.annotations.annotationforpendingtasks.Development;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

class TodoAnnotationTest {

    @Test
    void testTodoAnnotation() throws Exception {
        // Get all methods from the Development class
        Method[] methods = Development.class.getDeclaredMethods();

        boolean signupTaskFound = false;
        boolean dbOptimizationTaskFound = false;

        for (Method method : methods) {
            // Check if the method has the @Todo annotation
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);

                // Validate the annotation values
                if (method.getName().equals("signupFeature")) {
                    assertEquals("Implement signup autherization", annotation.task(), "Signup feature task mismatch");
                    assertEquals("Ankit Rajpoot", annotation.assignedTo(), "Signup feature assigned person mismatch");
                    assertEquals("HIGH", annotation.priority(), "Signup feature priority mismatch");
                    signupTaskFound = true;
                } else if (method.getName().equals("databaseOptimization")) {
                    assertEquals("Optimize database queries", annotation.task(), "Database optimization task mismatch");
                    assertEquals("Ankit", annotation.assignedTo(), "Database optimization assigned person mismatch");
                    assertEquals("MEDIUM", annotation.priority(), "Database optimization priority mismatch");
                    dbOptimizationTaskFound = true;
                }
            }
        }

        // Ensure both annotations are found
        assertTrue(signupTaskFound, "Method 'signupFeature' is missing @Todo annotation");
        assertTrue(dbOptimizationTaskFound, "Method 'databaseOptimization' is missing @Todo annotation");

    }
}
