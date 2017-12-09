package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogScrapperAutoConfiguration {
	
	@Bean
	LogScrapperAspect lsAspect() {
		return new LogScrapperAspect();
	}

}
