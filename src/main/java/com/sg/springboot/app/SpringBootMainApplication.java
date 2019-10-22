package com.sg.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sg.springboot.rest"})
public class SpringBootMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMainApplication.class, args);
	}
}
