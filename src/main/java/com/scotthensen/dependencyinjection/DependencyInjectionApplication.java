package com.scotthensen.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.scotthensen.dependencyinjection.controller.SpringConstructorInjectedController;
import com.scotthensen.dependencyinjection.controller.AnyController;
import com.scotthensen.dependencyinjection.controller.SpringPropertyInjectedController;
import com.scotthensen.dependencyinjection.controller.SpringSetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		AnyController controller = (AnyController) ctx.getBean("anyController");
		
		System.out.println(controller.hello()); 
		System.out.println(ctx.getBean(SpringPropertyInjectedController.class   ).sayHello());
		System.out.println(ctx.getBean(SpringSetterInjectedController.class     ).sayHello());
		System.out.println(ctx.getBean(SpringConstructorInjectedController.class).sayHello());
	}
}
