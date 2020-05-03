package com.slawomirlasik.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@Value("#{favoriteLanguages}")
	private Map<String, String> favoriteLanguagesOptions;

	@Value("#{operatingSystems}")
	private Map<String, String> preferedOperatingSystems;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a new student object
		Student theStudent = new Student();

		// add a student object to the model
		theModel.addAttribute("student", theStudent);

		// add the country options to the model
		theModel.addAttribute("theCountryOptions", countryOptions);

		// add the favorite languages options to the model
		theModel.addAttribute("theFavoriteLanguagesOptions", favoriteLanguagesOptions);

		// add the favorite languages options to the model
		theModel.addAttribute("thePreferedOperatingSystems", preferedOperatingSystems);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

		return "student-confirmation";
	}

}
