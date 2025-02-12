package com.dynamiconlinemarketplace;


import java.util.ArrayList;
import java.util.List;

// Defining a generic class to represent a product in the marketplace
public class Product<T extends ProductCategory> {
    // Declaring a private variable to store the product name
    private String productName;

    List<T> products = new ArrayList<>();

    // Declaring a private variable to store the price of the product
    private double price;

    // Declaring a private variable to store the category of the product
    private T category;

    // Constructor to initialize the product with name, price, and category
    public Product(String productName, double price, T category) {
	   this.productName = productName;
	   this.price = price;
	   this.category = category;
    }

    public void addProduct(T product) {
	   products.add(product);
    }

    public List<T> getProductList(){
	   return products;
    }
    // Method to get the product name
    public String getProductName() {
	   return productName;
    }

    // Method to get the product price
    public double getPrice() {
	   return price;
    }

    // Method to set the new price of the product
    public void setPrice(double price) {
	   this.price = price;
    }

    // Method to get the category details of the product
    public T getCategory() {
	   return category;
    }

    // Method to return product details as a string
    public String getProductDetails() {
	   return "Product: " + productName + ", Price: $" + price + ", " + category.getCategoryDetails();
    }
}



