package com.scotthensen.dependencyinjection.controller;

import com.scotthensen.dependencyinjection.service.GreetingServiceImpl;

// DO NOT DO PROPERTY INJECTION!

public class PropertyInjectedController 
{
	public GreetingServiceImpl greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
	
}
