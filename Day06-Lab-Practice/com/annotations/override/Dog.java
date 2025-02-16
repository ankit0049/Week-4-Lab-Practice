package com.annotations.override;

// Defining the subclass Dog that extends Animal
public class Dog extends Animal {
    // Overriding the makeSound() method using @Override annotation
    @Override
    public String makeSound() {
	   System.out.println("Dog barks");

	   // returning the dog sound
	   return "Bark! Bark!\n";
    }
}

