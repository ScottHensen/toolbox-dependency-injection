package com.scotthensen.dependencyinjection.controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

public class ConstructorInjectedController 
{
	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
}
