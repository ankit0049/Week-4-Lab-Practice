package regex.validateusername;

import com.regex.validateusername.UsernameValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsernameValidatorTest {
    @Test
    public void testOfValidateUsername(){
	   // Defining test usernames for the testing
	   String[] testUsernames = {"ankit_123", "123ankit", "an", "Ankit_1", "AnkitSinghRajpootTooLong123"};

	   // Defining the expected result to check weather testUsername is same as expected
	   boolean expectedResult[] = {true , false , false , true, false};

	   // Creating a Instance to make call the validate method
	   final UsernameValidator usernameValidator = new UsernameValidator();

	   // Creating a list to store the valid username
	   List<String> validUserName = new ArrayList<>();

	   // Create a list to store the invalid username
	   List<String> invalidUserName = new ArrayList<>();

	   // Iterate over testUsername and validate the username
	   for(int i=0; i< testUsernames.length; i++){
		  //Testing weather given username is validate perfectly and get the same result as expected

		  // Create a variable to store the valid username result
		  boolean status = UsernameValidator.isValidUsername(testUsernames[i]);
		  if(status){
			 validUserName.add(testUsernames[i]);
		  }else{
			 invalidUserName.add(testUsernames[i]);
		  }
		  // Testing weather the actual result is same as expected or not
		  assertEquals( expectedResult[i] , status);
	   }

	   System.out.println("Validation works Fine");
	   System.out.println("Valid names are : "+ validUserName);
	   System.out.println("Invalid names are : "+ invalidUserName);
    }
}
