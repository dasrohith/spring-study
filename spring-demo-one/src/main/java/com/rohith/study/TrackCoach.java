package com.rohith.study;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		super();
	}

	public String getDailyWorkout() {
		return "TrackCoach: Run your daily workout";
	}

	public String getDailyFortune() {
		return "Track " + this.fortuneService.getFortune();
	}
	
	protected void initCoach() {
		System.out.println("TrackCoach: protected init coach....");
	}
	
	protected void destroyCoach() {
		System.out.println("TrackCoach: protected destroy coach....");

	}

}
