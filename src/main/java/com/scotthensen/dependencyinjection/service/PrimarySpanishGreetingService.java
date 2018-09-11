package com.scotthensen.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")	//run this when running with spanish profile (more typically; this is for local/dev/uat/prod)
@Primary
public class PrimarySpanishGreetingService implements GreetingService
{

	@Override
	public String sayGreeting() 
	{
		return "hola - Servicio de Saludo Primario";
	}
	
}
