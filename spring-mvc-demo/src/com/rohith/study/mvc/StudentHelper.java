package com.rohith.study.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper {
	
	public static List<Country> getCountries(){
		List<Country> countries = new ArrayList<>();
		countries.add(new Country("IN", "India"));
		countries.add(new Country("UAE", "United Arab Emirates"));

		return countries;
	}

	public static List<Language> getLanguages() {
		List<Language> languages = new ArrayList<>();
		languages.add(new Language("java", "Java"));
		languages.add(new Language("cpp", "C#"));
		
		return languages;

	}

}
