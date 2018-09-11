package com.scotthensen.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary //we have 4 diff service beans; this tells Spring that this is the primary/default one, 
		 //   so we aren't forced to specify the bean with @Qualifier
@Profile({"en", "default"})  //this will be primary when running with english profile
							 //it will also be the primary by defualt if you do not specify a profile in properties
public class PrimaryGreetingService implements GreetingService
{

	@Override
	public String sayGreeting() 
	{
		return "Hello - this is the primary greeting service";
	}

}
