package com.springdockerjenhkins.springdevops;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDevopsApplication {

	Logger logger = LoggerFactory.getLogger(SpringDevopsApplication.class);

	@PostConstruct
	public void testApp(){
		logger.info("App started successfully !!!");
	}

	@PreDestroy
	public void destroyApp(){
		logger.warn("Application is getting destroyed !!!");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDevopsApplication.class, args);
	}
}
