package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	@PostMapping("/validate")
	public ModelAndView validate(@RequestParam String id, 
			@RequestParam String password)
	{
		//always we supposed to navigate to home only.
		ModelAndView mv = new ModelAndView("home");
		
		//temporarily I am assuing that id : niit
		//password L  niit@123 - are valid
		if(id.equals("niit") && password.equals("niit@123"))
		{
			//success message
			mv.addObject("msg", "welcome Mr/Ms "+ id);
		}
		else
		{
			//error message
			mv.addObject("msg", "Invalid credentials...pleas try again");
		}
		return mv;
		
	}

}








