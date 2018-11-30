package com.rohith.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		Coach myCoach = context.getBean("myCoach", Coach.class);

		System.out.println(myCoach.getDailyWorkout());

		context.close();
	}

}
