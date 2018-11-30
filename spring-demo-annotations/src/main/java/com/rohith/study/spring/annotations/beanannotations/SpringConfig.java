package com.rohith.study.spring.annotations.beanannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("bean-annotations.properties")
public class SpringConfig {
	
	@Bean
	MyLoggerConfig myLoggerConfig() {
		return new MyLoggerConfig();
	}
	
	@Bean
	FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
	
	

}
