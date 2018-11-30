package com.rohith.study.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Value(value = "${email}")
//	private String email;
	
//	@Value("${name}")
//	private String name;

//	@Autowired
//	public TennisCoach(@Qualifier("randomFileFortuneService") FortuneService fortuneService) {
//		System.out.println("Initializing Tennis Coach with Fortune Service...");
//		this.fortuneService = fortuneService;
//	}
	
	
	public TennisCoach() {
		System.out.println("Initializing Tennis Coach...");
	}
	
	@PostConstruct
	public void settingUp() {
		System.out.println("TennisCoach.settingUp()");
	}
	
	@PreDestroy
	public void cleaningUp() {
		System.out.println("TennisCoach.cleaningUp()");
		
	}

	public String getDailyWorkout() {
		return "Play Tennis for 10 min";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}


//	public String getEmail() {
//		return email;
//	}
//
//
//	public String getName() {
//		return name;
//	}

//	@Autowired
//	public void methodToSetFortuneService(FortuneService fortuneService) {
//		System.out.println("Setting Tennis Coach with Fortune Service through methodToSetFortuneService "+fortuneService);
//		this.fortuneService = fortuneService;
//	}

}
