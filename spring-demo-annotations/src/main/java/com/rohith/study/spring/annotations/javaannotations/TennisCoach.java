package com.rohith.study.spring.annotations.javaannotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Initializing Tennis Coach...");
	}
	
	public String getDailyWorkout() {
		return "Play Tennis for 10 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
