package com.rohith.study.spring.annotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceWithPostConstruct implements FortuneService {
	
	@Value("${fortune1}")
	private String fortune1;
	
	@Value("${fortune2}")
	private String fortune2;
	
	@Value("${fortune3}")
	private String fortune3;
	
	private String[] fortunes = { fortune1, fortune2, fortune3	};

	private Random random = new Random();
	public String getDailyFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
