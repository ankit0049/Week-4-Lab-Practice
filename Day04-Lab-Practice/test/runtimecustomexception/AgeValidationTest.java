package com.runtimecustomexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeValidationTest {
  @Test
    public void testOfAgeValidation(){
	 // Creating the age and test
	 int age = 18;

	 // Creating a variable and store the result
	 int actualResult = AgeValidation.checkUserAge(age);

	 if(age < 18){
		assertThrows(InvalidAgeException.class , ()->{
		    throw new  InvalidAgeException("Invalid Age");
		});
	 }
	 assertTrue(age>18 );
	 System.out.println("All test Case Passed");
  }
}