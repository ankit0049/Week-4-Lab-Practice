package com.personalisedmealgenerator;

// Creating a class for High-Protein Meals implementing MealPlan
public class HighProteinMeal implements MealPlan {
    // Declaring a private variable to store the protein type
    private String proteinType;

    // Constructor to initialize the high-protein meal with a protein type
    public HighProteinMeal(String proteinType) {
	   this.proteinType = proteinType;
    }

    // Implementing the method to return details of the high-protein meal
    @Override
    public String getMealDetails() {
	   return "High-Protein Meal with " + proteinType;
    }

    public String toString(){
        return proteinType;
    }
}