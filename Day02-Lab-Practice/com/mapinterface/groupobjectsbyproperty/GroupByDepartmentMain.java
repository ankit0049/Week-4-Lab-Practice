package com.mapinterface.groupobjectsbyproperty;

import java.util.Arrays;
import java.util.List;
import static com.mapinterface.groupobjectsbyproperty.GroupByDepartment.groupByDepartment;
public class GroupByDepartmentMain {
    public static void main(String[] args) {
	   // Creating a list of employees
	   List<Employee> employees = Arrays.asList(
			 // Alice belongs to HR department
			 new Employee("Ankit", "TR"),
			 // Bob belongs to IT department
			 new Employee("Rajput", "TR"),
			 // Carol also belongs to HR
			 new Employee("Udit", "HR")
	   );

	   // Printing employees grouped by department
	   System.out.println(groupByDepartment(employees));

    }
}
