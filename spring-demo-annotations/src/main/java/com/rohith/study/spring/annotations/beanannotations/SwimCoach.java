package com.rohith.study.spring.annotations.beanannotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${name}")
	private String name;
	
	@Value("${members}")
	private Integer members;
	
	public SwimCoach(FortuneService fortuneService) {
		System.out.println("Initializing Tennis Coach... with FortuneService "+fortuneService);
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {
		return "Swim for 1000 m";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public Integer getMembers() {
		return members;
	}
}
