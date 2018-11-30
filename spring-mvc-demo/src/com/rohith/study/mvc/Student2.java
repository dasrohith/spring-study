package com.rohith.study.mvc;

import java.util.List;

public class Student2 {

	private String firstName;
	private String lastName;

	private String country;
	
	private String favouriteLanguage;

	private List<Country> countries = StudentHelper.getCountries();
	private List<Language> languages = StudentHelper.getLanguages();


	public Student2() {

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

	public List<Country> getCountries() {
		return countries;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

}
