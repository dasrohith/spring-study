package com.rohith.study.spring.annotations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFileFortuneService implements FortuneService {

	@Value("${fortune.file.name}")
	private String fileName;

	private List<String> fortunes;
	private Random random;

	@PostConstruct
	public void setupMyData() throws IOException {
		System.out.println("RandomFileFortuneService.setupMyData()");
		System.out.println("Going to read from file : " + fileName);

		try (Stream<String> fileStream = Files.lines(Paths.get(fileName))) {
			fileStream.forEach(fortunes::add);
		} catch (IOException e) {
			throw e;
		}
		System.out.println(fortunes);

	}
	
	

	public RandomFileFortuneService() {

		fortunes = new ArrayList<String>();
		random = new Random();

	}

	public String getDailyFortune() {
		return fortunes.get(random.nextInt(fortunes.size()));
	}

}
