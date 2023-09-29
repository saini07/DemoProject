package com.example.DemoProject.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	public String getWelcomeMessage(){
//	Map<String, String> data = new HashMap<>();
//    data.put("key", "Welcome!!");
	return "Welcome to Hello World!!";
	}
}
