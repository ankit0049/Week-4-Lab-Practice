package com.annotations.rolebasedaccesscontrol;

import java.lang.reflect.Method;

// Defining the main class to check role-based access
public class RoleBasedAccessControl {
	public static void main(String[] args) throws Exception {
		String currentUserRole = "USER";

		// Getting the method object
		Method method = SecureService.class.getMethod("restrictedOperation");

		// Checking if the method has @RoleAllowed annotation
		if (method.isAnnotationPresent(RoleAllowed.class)) {
			RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);

			// Validating the role
			if (!annotation.value().equals(currentUserRole)) {
				System.out.println("Access Denied!");
				return;
			}
		}

		// Invoking the method if access is allowed
		method.invoke(new SecureService());
	}
}
