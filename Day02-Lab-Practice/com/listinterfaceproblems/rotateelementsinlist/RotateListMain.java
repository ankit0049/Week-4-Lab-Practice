package com.listinterfaceproblems.rotateelementsinlist;
import java.util.*;

public class RotateListMain {

	public static void main(String[] args) {
		// Test the rotate method
		List<Integer> list = Arrays.asList(78, 24, 14, 70, 50);

		// Create a rotated list to hold the rotated list result
		List<Integer> rotatedList = RotateList.rotate(list, 3);
		System.out.println("Rotated List: " + rotatedList);
	}
}
