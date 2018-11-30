package com.rohith.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(">> Memory Reference of myCoach > " + myCoach);

		Coach yourCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(">> Memory Reference of yourCoach > " + yourCoach);

		System.out.println("**** Coach comparison gives us a result of : "+ (myCoach == yourCoach));
		
		
	}

}
