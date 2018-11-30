package com.rohith.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		
		//call methods
		System.out.println(coach.getDailyWorkout());
		
		//make use of dependent fortune service
		System.out.println(coach.getDailyFortune());
		
		//close context
		context.close();

	}

}
