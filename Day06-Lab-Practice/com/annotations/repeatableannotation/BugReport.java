package com.annotations.repeatableannotation;

import java.lang.annotation.*;

// Defining the repeatable annotation @BugReport
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
public @interface BugReport {
	String description();
}
