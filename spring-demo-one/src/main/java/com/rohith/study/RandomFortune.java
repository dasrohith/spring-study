package com.rohith.study;

import java.util.Random;

public class RandomFortune implements FortuneService {
	
	private String[] fortunes = {
			"Good Day",
			"Super Day",
			"Wonderful day"
	};
	
	private Random random;
	
	

	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}



	public void setRandom(Random random) {
		this.random = random;
	}

}
