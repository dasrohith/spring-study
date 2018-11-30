package com.rohith.study;

public class BaseballCoach implements Coach {

	// private field for dependent fortune service
	private FortuneService fortuneService;

	// Constructor to inject dependency
	BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public BaseballCoach() {
		super();
	}

	public String getDailyWorkout() {
		return "BaseballCoach: Bat bat and bat";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
