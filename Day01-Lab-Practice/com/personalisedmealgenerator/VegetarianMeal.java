package com.personalisedmealgenerator;

// Defning a class for Vegetarian Meals implementing MealPlan
public class VegetarianMeal implements MealPlan {
    // Declaring a private variable to store the main ingredient
    private String mainIngredient;

    // Constructor to initialize the vegetarian meal with a main ingredient
    public VegetarianMeal(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Implementing the method to return details of the vegetarian meal
    @Override
    public String getMealDetails() {
        return "Vegetarian Meal with " + mainIngredient;
    }

    public String toString(){
        return mainIngredient;
    }
}