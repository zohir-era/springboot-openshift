package com.example.demo.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenshiftApplication.class, args);
	}

	@GetMapping("/greet")
	public String greetings() {
		return "Hello there...";
	}

	@GetMapping("/greet/{input}")
	public String greetingsByInput(@PathVariable String input) {
		return "Hello "+input;
	}

}
