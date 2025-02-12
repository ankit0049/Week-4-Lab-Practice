package com.personalisedmealgenerator;

// Defining a class for Vegan Meals implementing MealPlan
public class VeganMeal implements MealPlan {
    // Declaring a private variable to store the key protein source
    private String proteinSource;

    // Constructor to initialize the vegan meal with a protein source
    public VeganMeal(String proteinSource) {
	   this.proteinSource = proteinSource;
    }

    // Implementing the method to return details of the vegan meal
    @Override
    public String getMealDetails() {
	   return "Vegan Meal with Protein Source: " + proteinSource;
    }
    public String toString(){
        return proteinSource;
    }
}