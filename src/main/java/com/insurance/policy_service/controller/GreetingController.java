package com.insurance.policy_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/heath")
	public String greetingMessage() {
		String name = null;
		name.length();
		//String name = "Policy Service is Running...";

		return name;
	}
}
