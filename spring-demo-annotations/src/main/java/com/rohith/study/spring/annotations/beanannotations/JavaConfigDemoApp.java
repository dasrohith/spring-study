package com.rohith.study.spring.annotations.beanannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
//		Coach coach = context.getBean("swimCoach", Coach.class);
//		
//		System.out.println(coach.getDailyWorkout());
//		
//		System.out.println(coach.getDailyFortune());
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());

		System.out.println(coach.getEmail());

		System.out.println(coach.getName());

		System.out.println(coach.getMembers());

		context.close();
	}

}
