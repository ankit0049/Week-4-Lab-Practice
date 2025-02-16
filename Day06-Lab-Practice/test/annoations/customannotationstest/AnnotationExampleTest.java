package annoations.customannotationstest;

import com.annotations.customannotation.TaskInfo;
import com.annotations.customannotation.TaskManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;
import java.util.SortedMap;

class AnnotationExampleTest {

    @Test
    void testTaskInfoAnnotation() throws Exception {
        // Get the method reference
        Method method = TaskManager.class.getMethod("completeTask");

        // Check if annotation is present
        assertTrue(method.isAnnotationPresent(TaskInfo.class));

        // Get the annotation
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        // Validate annotation values
        assertEquals("High", taskInfo.priority());
        assertEquals("Ankit", taskInfo.assignedTo());
        System.out.println("Test cases passed");
    }
}
