package com.rohith.study;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Play Soccer";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
