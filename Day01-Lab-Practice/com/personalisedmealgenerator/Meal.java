package com.personalisedmealgenerator;

import java.util.ArrayList;
import java.util.List;

// Defining a generic class to manage different types of meal plans
public class Meal<T extends MealPlan> {
    // Declaring a private variable to store the meal category
    private String category;
    List<T> list = new ArrayList<>();

    // Declaring a private variable to store the meal details
    private T mealDetails;

    // Constructor to initialize the meal with category and details
    public Meal(String category, T mealDetails) {
	   this.category = category;
	   this.mealDetails = mealDetails;
	   list.add(mealDetails);
    }

     public List<T> getMeal() {
	    return list;
	}

	public void addMeal(T obj){
	   list.add(obj);
	}
    // Method to get the meal category
    public String getCategory() {
	   return category;
    }

    // Method to get the meal details
    public T getMealDetails() {
	   return mealDetails;
    }

    // Method to return full meal plan information as a string
    public String getFullMealPlanInfo() {
	   return "Category: " + category + ", " + mealDetails.getMealDetails();
    }
}