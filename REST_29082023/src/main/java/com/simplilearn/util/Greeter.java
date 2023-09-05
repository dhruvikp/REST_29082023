package com.simplilearn.util;

import org.springframework.stereotype.Component;

import com.simplilearn.model.Greet;

@Component
public class Greeter {

	public Greet getGreets() {
		System.out.println("Greet invoked!!");
		Greet greet = new Greet();
		greet.setName("Dhruvik");
		greet.setMessage("Hello World!");
		return greet;
	}
}
