package com.scotthensen.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.scotthensen.dependencyinjection.service.GreetingService;

// DO NOT DO PROPERTY INJECTION!

@Controller
public class SpringPropertyInjectedController 
{
	@Autowired
	@Qualifier("greetingServiceImpl")				// added this so that this bean instead of primary is injected
	public GreetingService greetingServiceImpl;		// reversed these to show spring's reflection
	
	public String sayHello()
	{
		return greetingServiceImpl.sayGreeting();
	}
	
}
