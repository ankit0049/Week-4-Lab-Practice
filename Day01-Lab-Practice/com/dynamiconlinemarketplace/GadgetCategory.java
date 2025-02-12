package com.dynamiconlinemarketplace;

// Defining a subclass for GadgetCategory, extending ProductCategory
public class GadgetCategory extends ProductCategory {
    // Declaring a private variable for the technology type of the gadget
    private String technologyType;

    // Constructor to initialize the gadget category with name and technology type
    public GadgetCategory(String categoryName, String technologyType) {
	   super(categoryName);
	   this.technologyType = technologyType;
    }

    // Implementing the method to return details of the gadget category
    @Override
    public String getCategoryDetails() {
	   return "Gadget Category: " + categoryName + ", Technology: " + technologyType;
    }

    public String toString(){
	   return categoryName;
    }
}