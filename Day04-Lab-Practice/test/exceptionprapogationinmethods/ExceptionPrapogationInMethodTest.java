package com.exceptionprapogationinmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionPrapogationInMethodTest {
  @Test
    public void testOfExceptionPrapogation(){

	 // Create a variable and store the number
	 int number1 = 78;
	 int number2 = 0;

	 assertThrows(Exception.class , ()->{
		ExceptionPrapogationInMethod.division2(number1, number2);
	 });
  }
}