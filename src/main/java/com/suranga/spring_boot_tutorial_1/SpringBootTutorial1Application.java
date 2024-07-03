package com.suranga.spring_boot_tutorial_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootTutorial1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorial1Application.class, args);
	}

	@GetMapping("/get")
	public List<String> hello(){
		return List.of("Hello", "World");
	}

}
