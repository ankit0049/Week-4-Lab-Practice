package com.annotations.annotationtomarkimportantmethods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Defining the custom annotation @ImportantMethod
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ImportantMethod {
	// Defining an optional level parameter with a default value "HIGH"
	String level() default "HIGH";
}
