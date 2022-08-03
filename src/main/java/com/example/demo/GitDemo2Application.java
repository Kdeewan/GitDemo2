package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemo2Application {

	@GetMapping("/getMassage")
	public String get()
	{
		return "This is how it works...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GitDemo2Application.class, args);
	}

}
