package com.simplilearn.config;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Component
public class ErrorHandler {
	
	@ExceptionHandler(value = Exception.class)
	public String arithmaticHandler() {
		return "Internal Server Error";
	}

	
}
