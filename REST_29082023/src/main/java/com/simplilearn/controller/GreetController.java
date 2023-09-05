package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Greet;
import com.simplilearn.util.Greeter;

@RestController
public class GreetController {

	@Autowired
	Greeter greeter;

	// @GetMapping("/greetMe")
	@RequestMapping(value = "/greetMe", method = RequestMethod.GET)
	public Greet greet() {
		return greeter.getGreets();
	}
}
