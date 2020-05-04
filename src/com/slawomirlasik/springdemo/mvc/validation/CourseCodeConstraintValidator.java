package com.slawomirlasik.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String> {
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}

	
	// this is the method for your custom validation
	// you can check anything concerning you bussiness logic 
	// against file data, Database etc
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		if( theCode != null) {
			result = theCode.startsWith(coursePrefix);
		}else {
			return true;
		}
		
		return result;
	}
	

}
