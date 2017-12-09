package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MonolithApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonolithApplication.class, args);
	}
	
	@RestController
	class Home {
		
		@RequestMapping("/")
		public String home() {
			return "Welcome Home Bozo!";
		}
		
	}
}
