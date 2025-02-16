package com.annotations.deprecated;

// Defining the class LegacyAPI
public class LegacyAPI {
    // Marking an old method as @Deprecated
    @Deprecated
    public String oldFeature() {
	   System.out.println("This is an old feature. Do not use it.");
	   return "Old Feature";
    }

    // Defining a new method to replace the deprecated method
    public String newFeature() {
	   System.out.println("This is the new recommended feature.");
	   return "New Feature";
    }
}

