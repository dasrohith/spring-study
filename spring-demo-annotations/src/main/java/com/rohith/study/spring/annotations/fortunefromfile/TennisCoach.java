package com.rohith.study.spring.annotations.fortunefromfile;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFileFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("Initializing Tennis Coach...");
	}
	
	@PreDestroy
	public void cleaningUp() {
		System.out.println("TennisCoach.cleaningUp()");
		
	}

	public String getDailyWorkout() {
		return "Play Tennis for 10 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
