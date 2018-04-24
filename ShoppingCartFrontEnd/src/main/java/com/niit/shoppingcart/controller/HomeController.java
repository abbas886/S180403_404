package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("home");
		//mv.addObject("loginMessage", "Thank for login");
		mv.addObject("isUserClickedLogin", true);
		return mv;

	}
	//http://localhost:8080/shoppingcart/register
		@GetMapping("/register")	
		
	public ModelAndView registration()
	{
			//if the user click register, this method will call
			//--discuss tomorrow.
			//Model,  ModelAndView
			//navigate to home page
		ModelAndView mv= new ModelAndView("home");	
		
		//carry the data
		//mv.addObject("msg", "Thank you for registration");
		mv.addObject("isUserClickedRegister", true);
			
		
		return mv;
	}
	
	
	
	@GetMapping("/logout")
	public ModelAndView logout()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("msg", "You successfully logged out from the app");
		//we need to write some other code to 
		//do actual logout functionality.
		//will add later.
		
		return mv;
	}
	
	
	
	
	
	
	
	
	

}
