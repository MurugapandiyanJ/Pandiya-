package com.tcs.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day14EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14EurekaClientApplication.class, args);
	}
@Autowired
RestTemplate template;
@GetMapping

}
