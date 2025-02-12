package aidrivenmanagementsystemtest;

import com.aidrivenmanagementsystem.*;
import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AiDrivenManagementSystemTest {

    // Test case to verify if the ResumeScreeningSystem correctly processes a Data Scientist resume
    @Test
    public void testOfDataScientist() {
	   // Creating a DataScientist object
	   DataScientist dataScientist = new DataScientist();

	   // Processing the resume with the provided name and job role
	   Resume<DataScientist> resume = ResumeScreeningSystem.processResume("Ankit", dataScientist);

	   // Adding the job role to the resume
	   resume.addJobRole(dataScientist);

	   // Expected job roles list containing "Data Scientist"
	   List<String> dataScientistList = List.of("Data Scientist");

	   // Verifying if the job roles in the resume match the expected list
	   assertEquals(dataScientistList, resume.getJobRolesList().stream().map(item -> item.jobTitle).toList());
    }

    // Test case to verify if the ResumeScreeningSystem correctly processes a Product Manager resume
    @Test
    public void testOfProductManager() {
	   // Creating a ProductManager object
	   ProductManager productManager = new ProductManager();

	   // Processing the resume with the provided name and job role
	   Resume<ProductManager> resume = ResumeScreeningSystem.processResume("Ankit", productManager);

	   // Adding the job role to the resume
	   resume.addJobRole(productManager);

	   // Expected job roles list containing "Product Manager"
	   List<String> productManagerList = List.of("Product Manager");

	   // Verifying if the job roles in the resume match the expected list
	   assertEquals(productManagerList, resume.getJobRolesList().stream().map(item -> item.jobTitle).toList());
    }

    // Test case to verify if the ResumeScreeningSystem correctly processes a Software Engineer resume
    @Test
    public void testOfSoftwareEngineer() {
	   // Creating a SoftwareEngineer object
	   SoftwareEngineer softwareEngineer = new SoftwareEngineer();

	   // Processing the resume with the provided name and job role
	   Resume<SoftwareEngineer> resume = ResumeScreeningSystem.processResume("Ankit", softwareEngineer);

	   // Adding the job role to the resume
	   resume.addJobRole(softwareEngineer);

	   // Expected job roles list containing "Software Engineer"
	   List<String> softwareEngineerList = List.of("Software Engineer");

	   // Verifying if the job roles in the resume match the expected list
	   assertEquals(softwareEngineerList, resume.getJobRolesList().stream().map(item -> item.jobTitle).toList());
    }
}
