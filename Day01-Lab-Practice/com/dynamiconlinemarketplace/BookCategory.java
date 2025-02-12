package com.dynamiconlinemarketplace;

// Creating a subclass for BookCategory, extending ProductCategory
public class BookCategory extends ProductCategory {
    // Declaring a private variable for the genre of the book
    private String genre;

    // Constructor to initialize the book category with name and genre
    public BookCategory(String categoryName, String genre) {
	   super(categoryName);
	   this.genre = genre;
    }

    // Implementing the method to return details of the book category
    @Override
    public String getCategoryDetails() {
	   return "Book Category: " + categoryName + ", Genre: " + genre;
    }

    public String toString(){
	   return categoryName;
    }
}
