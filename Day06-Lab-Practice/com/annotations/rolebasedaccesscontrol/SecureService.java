package com.annotations.rolebasedaccesscontrol;

// Defining a class that uses @RoleAllowed annotation
public class SecureService {
	// Applying the annotation to restrict access
	@RoleAllowed("ADMIN")
	public void restrictedOperation() {
		System.out.println("Admin operation executed");
	}
}

