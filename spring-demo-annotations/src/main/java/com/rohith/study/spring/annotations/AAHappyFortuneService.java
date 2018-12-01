package com.rohith.study.spring.annotations;

import org.springframework.stereotype.Component;

import com.rohith.study.spring.annotations.FortuneService;

@Component("happyFortuneService")
public class AAHappyFortuneService implements FortuneService {

	public String getDailyFortune() {
		return "Today is my Lucky Day";
	}

}
