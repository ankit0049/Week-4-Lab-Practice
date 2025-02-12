package com.personalisedmealgenerator;

// Defining an interface to represent a Meal Plan
interface MealPlan {
    // Abstract method to get meal details, to be implemented by specific meal types
    String getMealDetails();
}