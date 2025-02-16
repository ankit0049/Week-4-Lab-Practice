package com.annotations.suppressuncheckedwarnings;

import java.util.ArrayList;
import java.util.List;

// Defining the class to demonstrate unchecked warning suppression
public class SuppressWarningsExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Creating an ArrayList without generics
		List rawList = new ArrayList();

		// Adding elements to the list
		rawList.add("Hello");
		rawList.add(123);

		// Access an element without type safety
		String firstElement = (String) rawList.get(0);
		System.out.println(firstElement);

	}
}
