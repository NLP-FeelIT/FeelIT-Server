package com.example.feelit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FeelItApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeelItApplication.class, args);
	}

}
