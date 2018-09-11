package com.scotthensen.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

@Controller
public class SpringConstructorInjectedController 
{
	private GreetingService greetingService;
	
	//Qualifier tells Spring WHICH service to inject since we now have 3 implementations
	//The string is the bean name (lower case)
	public SpringConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
