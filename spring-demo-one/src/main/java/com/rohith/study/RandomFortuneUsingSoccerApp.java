package com.rohith.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneUsingSoccerApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4RandomFortune.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
	}

}
