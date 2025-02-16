package regex.validatelicenseplatenumbertest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.regex.validatesocialsecuritynumber.SSNValidator.isValidSSN;
import static com.regex.validatelicenseplateumber.LicensePlateValidator.isValidLicensePlate;

public class LicensePlateValidatorTest { 
    @Test
    public void testOfValidateNumber(){
	   // Defining test cases with both valid and invalid LicenseNumber
	   String[] licenseNumber = {"CF1234", "G12345", "AN5678", "Z91234", "al1234", "DI12"};

	   // Creating the expected result
	   boolean excpected[] = {true , false , true , false , false, false};

	   // Creating a list for valid security number format
	   List<String> validLicenseNumber = new ArrayList<>();

	   // Iterate through the licenseNumber and check weather security number format is valid
	   for(int i =0; i<licenseNumber.length; i++){
		  // Creating a isValidlicenseNumbertatus variable and store the result
		  boolean isValidlicenseNumbertatus = isValidLicensePlate(licenseNumber[i]);

		  if(isValidlicenseNumbertatus)validLicenseNumber.add(licenseNumber[i]);

		  // Checking weather isValidlicenseNumber validate correctly
		  Assertions.assertEquals( excpected[i] , isValidlicenseNumbertatus);

	   }
	   System.out.println("Valid number are : "+ validLicenseNumber);
    }
}
