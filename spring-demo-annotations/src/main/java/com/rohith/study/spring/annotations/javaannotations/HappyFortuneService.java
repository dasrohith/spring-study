package com.rohith.study.spring.annotations.javaannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getDailyFortune() {
		return "Today is my Lucky Day";
	}

}
