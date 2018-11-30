package com.rohith.study;

public class MyApp {

	public static void main(String[] args) {
		 Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyWorkout());
		
		coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
	}

}
