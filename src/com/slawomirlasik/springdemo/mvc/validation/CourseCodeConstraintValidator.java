package com.slawomirlasik.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String> {
	
	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	
	// this is the method for your custom validation
	// you can check anything concerning you bussiness logic 
	// against file data, Database etc
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		if( theCode != null) {
			//
            // loop thru course prefixes
            //
            // check to see if code matches any of the course prefixes
            //
			for(String coursePrefix: coursePrefixes) {
				result = theCode.startsWith(coursePrefix);

                // if we found a match then break out of the loop
				if(result) break;
			}
		}else {
			return true;
		}
		
		return result;
	}
	

}
