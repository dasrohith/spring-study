package com.rohith.study.spring.annotations.fortunefromfile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneFromFileAnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("fortuneFromFileApplicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}

}
