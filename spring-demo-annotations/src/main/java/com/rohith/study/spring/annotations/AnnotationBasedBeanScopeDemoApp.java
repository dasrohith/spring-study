package com.rohith.study.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBasedBeanScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("tennisCoach >>"+ tennisCoach);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("alphaCoach >> "+alphaCoach);
		
		System.out.println("Is tennisCoach and alphaCoach are same? - "+ (tennisCoach == alphaCoach));
		
		context.close();
	}

}
