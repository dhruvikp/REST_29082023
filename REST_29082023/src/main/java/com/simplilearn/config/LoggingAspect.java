package com.simplilearn.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.simplilearn.util.Greeter.*(..))")
    public void logBeforeGreet(JoinPoint joinPoint) { 
		System.out.println("Invoked..");
	}
	
	@Before("execution(* com.simplilearn.util.Greeter.getGreets())")
    public void logBeforeGreet1(JoinPoint joinPoint) { 
		System.out.println("Invoked1..");
	}
	
	@After("execution(* com.simplilearn.util.Greeter.getGreets())")
    public void logAfterGreet(JoinPoint joinPoint) { 
		System.out.println("After invoked..");
	}
}
