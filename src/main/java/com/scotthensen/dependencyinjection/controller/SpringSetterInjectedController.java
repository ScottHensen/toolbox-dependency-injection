package com.scotthensen.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

@Controller
public class SpringSetterInjectedController 
{
	private GreetingService greetingService;
	
	public String sayHello()
	{
		return greetingService.sayGreeting();
	}
	
	@Autowired
	//@Qualifier("setterGreetingService")  - could specify the bean here too
	public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService)
	{
		this.greetingService = greetingService;
	}
}
