package com.multiplecatchblock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleCatchBlockTest {
  @Test
    public void testOfArrayValueOnOutRangeIndex(){
	 // Creating the nums array for test
	 int nums[]= { 45, 89 };

	 // AssertThrow to check weather program returning expected exception or not
	 assertThrows(IndexOutOfBoundsException.class ,()->{
		throw new IndexOutOfBoundsException("Index is not fessible according size of array");
	 });
  }

  @Test
    public void  testOfEmptyArray(){
	 int nums[] ={};
	 // AssertThrow to check weather program returning expected exception or not
	 assertThrows(NullPointerException.class ,()->{
		throw new NullPointerException("Accessing index not fessible because of Empty array");
	 });
  }
}