package com.dynamiconlinemarketplace;

// Defining a utility class to handle product-related operations
public class ProductUtils {
    // Implementing a generic method to apply a discount dynamically
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
	   // Calculating the new price after applying the discount
	   double discountedPrice = product.getPrice() - (product.getPrice() * (percentage / 100));

	   // Updating the product's price with the new discounted price
	   product.setPrice(discountedPrice);
    }
}
