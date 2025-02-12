package multilevelcoursemanagementsystemtest;

import com.multilevelcoursemanagementsystem.AssignmentCourse;
import com.multilevelcoursemanagementsystem.Course;
import com.multilevelcoursemanagementsystem.ExamCourse;
import com.multilevelcoursemanagementsystem.ResearchCourse;
import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiLevelCourseManagementSystemTest {

    // Test case to verify if the AssignmentCourse is correctly added and retrieved
    @Test
    public void testOfAssignmentCourse() {
	   // Creating an AssignmentCourse with a name and duration
	   AssignmentCourse webDevelopment = new AssignmentCourse("Web Development", 5);

	   // Creating a Course object for Information Technology and adding the assignment course to it
	   Course<AssignmentCourse> itAssignmentCourse = new Course<>("Information Technology", webDevelopment);
	   itAssignmentCourse.addCourse(webDevelopment);

	   // Expected course list containing "Web Development"
	   List<String> assignmentCourse = List.of("Web Development");

	   // Checking if the added course matches the expected list
	   assertEquals(assignmentCourse, itAssignmentCourse.getCourseList().stream().map(item -> item.courseName).toList());
    }

    // Test case to verify if the ExamCourse is correctly added and retrieved
    @Test
    public void testOfExamCourse() {
	   // Creating an ExamCourse with a name and total marks
	   ExamCourse dataStructures = new ExamCourse("Data Structures", 70);

	   // Creating a Course object for Computer Science and adding the exam course to it
	   Course<ExamCourse> csExamCourse = new Course<>("Computer Science", dataStructures);
	   csExamCourse.addCourse(dataStructures);

	   // Expected course list containing "Data Structures"
	   List<String> CsExamCourse = List.of("Data Structures");

	   // Checking if the added course matches the expected list
	   assertEquals(CsExamCourse, csExamCourse.getCourseList().stream().map(item -> item.courseName).toList());
    }

    // Test case to verify if the ResearchCourse is correctly added and retrieved
    @Test
    public void testOfResearchCourse() {
	   // Creating a ResearchCourse with a name and research topic
	   ResearchCourse aiResearch = new ResearchCourse("Artificial Intelligence", "Machine Learning Applications");

	   // Creating a Course object for Artificial Intelligence and adding the research course to it
	   Course<ResearchCourse> aiResearchCourse = new Course<>("Artificial Intelligence", aiResearch);
	   aiResearchCourse.addCourse(aiResearch);

	   // Expected course list containing "Artificial Intelligence"
	   List<String> aiResearchCourseList = List.of("Artificial Intelligence");

	   // Checking if the added course matches the expected list
	   assertEquals(aiResearchCourseList, aiResearchCourse.getCourseList().stream().map(item -> item.courseName).toList());
    }
}
