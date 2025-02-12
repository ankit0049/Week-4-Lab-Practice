package com.dynamiconlinemarketplace;

// Creating a subclass for ClothingCategory, extending ProductCategory
public class ClothingCategory extends ProductCategory {
    // Declaring a private variable for clothing type
    private String clothingType;

    // Constructor to initialize the clothing category with name and type
    public ClothingCategory(String categoryName, String clothingType) {
	   super(categoryName);
	   this.clothingType = clothingType;
    }

    // Implementing the method to return details of the clothing category
    @Override
    public String getCategoryDetails() {
	   return "Clothing Category: " + categoryName + ", Type: " + clothingType;
    }

    public String toString(){
	   return categoryName;
    }
}