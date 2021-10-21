package com.spindl.spindlapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping("/blacksmith")
	public String blacksmith() {
		return "Looking to protect yourself, or deal some damage?";
	}
}