package com.example.DemoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DemoProject.Service.HelloWorldService;

import java.util.HashMap;
import java.util.Map;

@RestController
@Validated
public class HelloWorldController {
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping(path="/welcome")
	public ResponseEntity<Object> getWelcomeMessage() {
//		return "Welcome to Hello World!!";
		String msg=helloWorldService.getWelcomeMessage();
		return new ResponseEntity<Object>(msg, HttpStatus.OK);
	}
}
