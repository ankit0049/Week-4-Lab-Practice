package mapinterfaceproblemtest;

import com.mapinterface.groupobjectsbyproperty.Employee;
import com.mapinterface.groupobjectsbyproperty.GroupByDepartment;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupObjectByPropertyTest {
    @Test
    public void testGroupObjectByProperty() {
	   //  Create a list of Employee objects
	   List<Employee> userInputList = List.of(
			 new Employee("Ankit", "TR"),
			 new Employee("Abhishek", "TR")
	   );

	   // Call the method to test
	   Map<String, List<Employee>> actualResult = GroupByDepartment.groupByDepartment(userInputList);

	   // Expected result map
	   Map<String, List<Employee>> expectedResult = new HashMap<>();
	   expectedResult.put("TR", List.of(
			 new Employee("Ankit", "TR"),
			 new Employee("Abhishek", "TR")
	   ));

	   // Compare expected vs. actual
	   assertEquals(expectedResult, actualResult, "Grouping by department failed!");
    }
}
