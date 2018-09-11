package com.scotthensen.dependencyinjection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.scotthensen.dependencyinjection.controller.SetterInjectedController;
import com.scotthensen.dependencyinjection.service.GreetingServiceImpl;

public class SetterInjectedControllerTest 
{
	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception
	{
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	@Test
	public void test() 
	{
		assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
	}

}
