package com.dynamiconlinemarketplace;

// Main class to execute and test the online marketplace system
public class OnlineMarketplaceMain {
    public static void main(String[] args) {
	   // Creating instances of different product categories
	   BookCategory fictionCategory = new BookCategory("Books", "Fiction");
	   ClothingCategory casualWear = new ClothingCategory("Clothing", "Casual Wear");
	   GadgetCategory smartDevices = new GadgetCategory("Gadgets", "Smart Devices");

	   // Creating products with different categories
	   Product<BookCategory> book = new Product<>("The Lord of the Rings by J R R Tolkien", 20.0, fictionCategory);
	   Product<ClothingCategory> tShirt = new Product<>("Graphic Shirt", 25.0, casualWear);
	   Product<GadgetCategory> smartwatch = new Product<>("Smartwatch", 1250.0, smartDevices);

	   // Displaying product details before applying discounts
	   System.out.println("Product Details Before Discount:");
	   System.out.println(book.getProductDetails());
	   System.out.println(tShirt.getProductDetails());
	   System.out.println(smartwatch.getProductDetails());

	   // Applying a 10% discount on all products using the generic method
	   ProductUtils.applyDiscount(book, 10);
	   ProductUtils.applyDiscount(tShirt, 15);
	   ProductUtils.applyDiscount(smartwatch, 20);

	   // Displaying product details after applying discounts
	   System.out.println("\nProduct Details After Discount:");
	   System.out.println(book.getProductDetails());
	   System.out.println(tShirt.getProductDetails());
	   System.out.println(smartwatch.getProductDetails());
    }
}