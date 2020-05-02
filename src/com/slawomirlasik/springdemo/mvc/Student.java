package com.slawomirlasik.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private Map<String, String> countryOptions;
	private String country;

	public Student() {
		super();
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		
		countryOptions.put("BR", "Brasil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		countryOptions.put("PL", "Poland");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	

}
