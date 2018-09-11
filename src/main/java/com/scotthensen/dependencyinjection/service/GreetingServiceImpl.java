package com.scotthensen.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService 
{
	public static final String HELLO_WORLD = "Hello - this is the og greeting service";
	
	@Override
	public String sayGreeting()
	{
		return HELLO_WORLD;
	}
}
