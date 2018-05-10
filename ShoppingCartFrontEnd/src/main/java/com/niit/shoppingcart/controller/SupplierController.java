package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class SupplierController {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private User user;
	
	@Autowired
	private HttpSession httpSession;

	@PostMapping("/supplier/save")
	public ModelAndView saveSupplier(@RequestParam String emailID, @RequestParam String name,
			@RequestParam String password, @RequestParam String confirm_password, @RequestParam String mobile,
			@RequestParam String address) {
		ModelAndView mv = new ModelAndView("redirect:/manage_suppliers");

		user.setAddress(address);
		user.setEmailID(emailID);
		user.setMobile(mobile);
		user.setName(name);
		user.setPassword(password);
		user.setRole('S');

		// check whether the record already exist
		// with this emaild or not
		// if existed, give message "The record already exist"
	/*	if (userDAO.get(emailID) != null) {
			mv.addObject("message", "The record already exist");

		} else
*/
		if (userDAO.save(user)) {
			mv.addObject("message", "You successfully registered as supplier");
		} else {
			mv.addObject("message", "Could not register.  please try after some time.");

		}

		return mv;

	}
	
	
	
	
	
	@GetMapping("/supplier/delete")
	public ModelAndView deleteSupplier(@RequestParam String emailID)
	{
		
		ModelAndView mv = new ModelAndView("redirect:/manage_suppliers");
	
		if (userDAO.delete(emailID)) {
			mv.addObject("message", "Supplier successfully delete");
		} else {
			mv.addObject("message", "Could not delete.  please try after some time.");

		}

		return mv;
	}
	
	
	
	
	@GetMapping("/supplier/edit")
	public String editSupplier(@RequestParam String emailID, Model model)
	{
	 User selectedSupplier=	userDAO.get(emailID);
	// httpSession.setAttribute("selectedSupplier", selectedSupplier);
	 model.addAttribute("selectedSupplier", selectedSupplier);
		return "redirect:/manage_suppliers";
		
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
