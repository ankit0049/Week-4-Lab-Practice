package com.personalisedmealgenerator;

// Defining a class for Keto Meals implementing MealPlan
public class KetoMeal implements MealPlan {
    // Declaring a private variable to store the primary fat source
    private String fatSource;

    // Constructor to initialize the keto meal with a fat source
    public KetoMeal(String fatSource) {
	   this.fatSource = fatSource;
    }

    // Implementing the method to return details of the keto meal
    @Override
    public String getMealDetails() {
	   return "Keto Meal with Fat Source: " + fatSource;
    }
    public String toString(){
        return fatSource;
    }
}