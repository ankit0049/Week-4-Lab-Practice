package com.personalisedmealgenerator;
import java.util.List;

// Defining a utility class to handle meal-related operations
public class MealUtils {
    // Implementing a generic method to validate and generate a personalized meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(String category, T meal) {
	   // Checking if the provided meal category is valid
	   if (!category.equalsIgnoreCase("Vegetarian") &&
			 !category.equalsIgnoreCase("Vegan") &&
			 !category.equalsIgnoreCase("Keto") &&
			 !category.equalsIgnoreCase("High-Protein")) {
		  throw new IllegalArgumentException("Invalid meal category!");
	   }

	   // Returning a new Meal object with the provided category and meal details
	   return new Meal<>(category, meal);
    }

    // Implementing a method to display all meal plans dynamically using wildcards
    public static void displayAllMeals(List<? extends MealPlan> meals) {
	   // Iterating over each meal and printing its details
	   for (MealPlan meal : meals) {
		  System.out.println(meal.getMealDetails());
	   }
    }
}


