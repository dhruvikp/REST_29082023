package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;

@RestController
public class GreetController {

	//@GetMapping("/greetMe")
	@RequestMapping(value = "/greetMe", method=RequestMethod.GET )
	public Greet greet() {
		Greet greet = new Greet();
		greet.setName("Dhruvik");
		greet.setMessage("Hello World!");
		return greet;
	}
}
