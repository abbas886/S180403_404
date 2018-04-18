package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//convert this class into Servlet / Controller
@Controller
public class HomeController {
	
	//we have to define hadler mapping
	//Different types of mappings
	//@GetMapping - doGet
	//@PostMapping - doPost  - create
	//@PutMapping	-doPut   - update
	//@DeleteMapping - doDelete - delete
	
	
	//   http://localhost:8080/shoppingcart/
		@GetMapping("/")
	//@RequestMapping(value="/",   method = RequestMethod.GET)
	public String homePage()
	{
			System.out.println("The method homePage is called");
		return "home";
	}
		
	//http://localhost:8080/shoppingcart/login	
	@GetMapping("/login")	
	public void login()
	{
		System.out.println("login method called");
	}
	//http://localhost:8080/shoppingcart/register
		@GetMapping("/register")	
		
	public void registration()
	{
		System.out.println("registration method called");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
