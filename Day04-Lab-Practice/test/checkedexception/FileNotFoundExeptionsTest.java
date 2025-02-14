package com.checkedexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNotFoundExeptionsTest {

    // This test for when file is present
    @Test
    public void testOfFileReadingMethod(){

	   // Creating the variable that hold the source location
	   String path = "data.txt";

	   // Creating the other path for exception test
	   String path2 = "InvalidLocation.txt";

	   // Create a variable and store the output of the read method
	   String expectedData = FileNotFoundExeptions.checkException(path);

	   if(expectedData.isBlank()) {
		  assertThrows(FileNotFoundExeptions.class, () -> FileNotFoundExeptions.checkException(path2));
	   }
	   //Check the test case is valid or not
	   assertTrue(expectedData.length() > 0);
    }

}