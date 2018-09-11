package com.scotthensen.dependencyinjection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.scotthensen.dependencyinjection.controller.ConstructorInjectedController;
import com.scotthensen.dependencyinjection.service.GreetingServiceImpl;

public class ConstructorInjectedControllerTest 
{
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() throws Exception 
	{
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void test() 
	{
		assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
	}

}
