package com.scotthensen.dependencyinjection.controller;

import org.springframework.stereotype.Controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

@Controller
public class AnyController 
{
	private GreetingService greetingService;
	
	public AnyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello()
	{
		System.out.println("hello");
		return greetingService.sayGreeting();
	}
}
