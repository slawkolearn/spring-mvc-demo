package com.slawomirlasik.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String firstName;

	private String lastName;

	private String country;

	private String favoriteLanguage;
	
	private Map<String, String> favoriteLanguagesOptions;

	public Student() {
		super();
		
		favoriteLanguagesOptions = new LinkedHashMap<>();
		
		// parameter order: value, display label
		favoriteLanguagesOptions.put("Java", "Java");
		favoriteLanguagesOptions.put("C#", "C#");
		favoriteLanguagesOptions.put("PHP", "PHP");
		favoriteLanguagesOptions.put("Ruby", "Ruby");
		favoriteLanguagesOptions.put("Python", "Python");

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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Map<String, String> getFavoriteLanguagesOptions() {
		return favoriteLanguagesOptions;
	}

}
