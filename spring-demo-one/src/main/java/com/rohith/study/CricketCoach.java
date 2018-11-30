package com.rohith.study;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String teamName;
	
	public CricketCoach() {
		System.out.println("Auto-generated constructor stub");
	}

	public String getDailyWorkout() {
		return "Bat for 25 minutes";
	}

	public String getDailyFortune() {
		return "Bat ->"+this.fortuneService.getFortune();
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting fortune service");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting Email Address: "+emailAddress);
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("Setting Team Name: "+teamName);
		this.teamName = teamName;
	}

}
