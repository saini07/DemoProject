package com.example.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/welcome")
	public String WelcomeMesage() {
		return "Welcome to Hello World!!";
	}
}
