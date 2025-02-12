package com.personalisedmealgenerator;// Main class to execute and test the Personalized Meal Plan Generator
import java.util.*;

public class PersonalizedMealPlanSystem {
    public static void main(String[] args) {
	   // Creating instances of different meal types
	   VegetarianMeal vegMeal = new VegetarianMeal("Tofu and Vegetables");
	   VeganMeal veganMeal = new VeganMeal("Lentils and Spinach");
	   KetoMeal ketoMeal = new KetoMeal("Avocado and Cheese");
	   HighProteinMeal proteinMeal = new HighProteinMeal("Grilled Chicken");

	   // Generating meal plans using the utility method
	   Meal<VegetarianMeal> vegetarianPlan = MealUtils.generateMealPlan("Vegetarian", vegMeal);
	   Meal<VeganMeal> veganPlan = MealUtils.generateMealPlan("Vegan", veganMeal);
	   Meal<KetoMeal> ketoPlan = MealUtils.generateMealPlan("Keto", ketoMeal);
	   Meal<HighProteinMeal> highProteinPlan = MealUtils.generateMealPlan("High-Protein", proteinMeal);

	   // Displaying meal plan details individually
//	   System.out.println("Meal Plan Details:");
//	   System.out.println(vegetarianPlan.getFullMealPlanInfo());
//	   System.out.println(veganPlan.getFullMealPlanInfo());
//	   System.out.println(ketoPlan.getFullMealPlanInfo());
//	   System.out.println(highProteinPlan.getFullMealPlanInfo());
//
//	   // Storing all meals in a list using wildcards
//	   List<MealPlan> allMeals = new ArrayList<>();
//	   allMeals.add(vegMeal);
//	   allMeals.add(veganMeal);
//	   allMeals.add(ketoMeal);
//	   allMeals.add(proteinMeal);
//
//	   // Displaying details of all meal plans using the utility method
//	   System.out.println("\nDisplaying All Meal Plans:");
//	   MealUtils.displayAllMeals(allMeals);


	   System.out.println(vegetarianPlan.getMeal());
    }
}