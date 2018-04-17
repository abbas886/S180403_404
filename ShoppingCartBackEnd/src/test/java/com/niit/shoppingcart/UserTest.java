package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	
	public static void main(String[] args) {
		
		//check whether User instance is
		//created or not.
		
		//Because we are configuring the beans using
		//Annotations
		//Bean configuration we can do in 2 ways
		//1)Using Annotations
		//2)xml based configuration
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//it will check the classes which are there
		//in this package with annotated with @Component
		context.scan("com.niit");
		//It will clear the exist beans
		//and create new beans of the classes
		//which are in package com.niit
		//with annotated with @Component
		context.refresh();
		
		//I need one instance
		//as context
		context.getBean("product");
		
		System.out.println("The bean is created successfully");
		
		
		
		
	}

	
	
	
}
