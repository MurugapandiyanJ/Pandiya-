package com.tcs.service.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/rest/service")	
public class HelloService{
			@Value("name")
			String str;
			
			@Autowired
			Environment environment;
			
			@GetMapping
			public String Welcome() {
				String port = environment.getProperty("server.port");
				return "Programming Microservice @" +port+"Appname:"+str;
			}
			@GetMapping("/status")	
			public String status() {
				return "up and running";
			}
				
}

