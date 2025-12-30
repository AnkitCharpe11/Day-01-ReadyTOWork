package com.insurance.policy_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/heath")
	public String greetingMessage() {
		// String name = null;

		String name = "Policy Service is Running...";
		name = name + name.toLowerCase();// now latest coded is this 
		//this code is from main branch 
		return name;
	}
}
