package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

@ShellComponent
@Service
public class HelloCommand {

	@Autowired
	WordCountService wordCountService;

	@ShellMethod(key = "hello", value = "Say hello")
	public String hello(@ShellOption(defaultValue = "spring") String arg) {
		String words = arg;
		Map<String, Long> counts = wordCountService.getCount(Arrays.stream(words.split("\\s")).toList());
		counts.forEach((key, value) -> System.out.println(key + " " + value));
		return "bye";
	}

	@ShellMethod(key = "goodbye", value = "Say goodbye")
	public String goodbye() {
		return "Goodbye!";
	}
}