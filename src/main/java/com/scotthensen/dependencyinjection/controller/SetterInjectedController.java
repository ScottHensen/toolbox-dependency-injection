package com.scotthensen.dependencyinjection.controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

public class SetterInjectedController 
{
	private GreetingService greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
