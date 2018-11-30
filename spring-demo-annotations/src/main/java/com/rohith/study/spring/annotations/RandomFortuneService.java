package com.rohith.study.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"Rohu",
			"Chakku",
			"Sidhu"
	};

	private Random random = new Random();
	public String getDailyFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
