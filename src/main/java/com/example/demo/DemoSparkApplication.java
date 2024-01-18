package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Map;

@SpringBootApplication
public class DemoSparkApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoSparkApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		/*String words = args[0];
		Map<String, Long> counts = new DemoSparkApplication().wordCountService.getCount(Arrays.stream(words.split("\\s")).toList());
		counts.forEach((key, value) -> System.out.println(key + " " + value));*/
	}
}
