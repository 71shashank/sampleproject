package com.scaler.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleprojectApplication {
	@GetMapping("/hello")
	public String hello(){
		return "Hello hi!";
	}


	public static void main(String[] args) {

		SpringApplication.run(SampleprojectApplication.class, args);
	}

}
