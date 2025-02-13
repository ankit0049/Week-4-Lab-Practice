package com.dynamiconlinemarketplace;

// Creating abstract class to represent a product category
abstract class ProductCategory {
    // Declaring a protected variable to store the category name
    public String categoryName;

    // Constructor to initialize the category name
    public ProductCategory(String categoryName) {
	   this.categoryName = categoryName;
    }

    // Abstract method to get the category details, to be implemented by subclasses
    public abstract String getCategoryDetails();
}