package com.scotthensen.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService
{
	@Override
	public String sayGreeting()
	{
		return "hello - i was injected by the constructor";
	}
}
