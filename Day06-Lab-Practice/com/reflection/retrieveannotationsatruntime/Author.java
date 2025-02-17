package com.reflection.retrieveannotationsatruntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Defining the @Author annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	// Defining an annotation field 'name'
	String name();
}
