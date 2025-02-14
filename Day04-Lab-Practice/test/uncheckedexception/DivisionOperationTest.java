package com.uncheckedexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionOperationTest {
   @Test
    public void testOfDivisionForRuntimeException(){
	  // Suppose the first number is  and second is 0
	  int first = 10;
	  int second = 0;
	 assertThrows(ArithmeticException.class, ()->{
		throw new RuntimeException("Invalid Input");
	 });
   }
}