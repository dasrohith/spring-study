package com.rohith.study.mvc;

public class Country {

	private String code;
	private String countryName;

	public Country(String code, String countryName) {
		this.code = code;
		this.countryName = countryName;
	}

	public String getCode() {
		return code;
	}

	public String getCountryName() {
		return countryName;
	}

}
