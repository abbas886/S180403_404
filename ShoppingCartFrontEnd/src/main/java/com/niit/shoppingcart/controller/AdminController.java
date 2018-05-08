package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

@Controller
public class AdminController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping("/manage_categories")
	public ModelAndView manageCategories()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("isAdminClickedManageCategories", true);
		//load all the categories and set to httpSession
		List<Category> categories =  categoryDAO.list();
		httpSession.setAttribute("categories", categories);
		
		return mv;
	}
	
	@GetMapping("/manage_suppliers")
	public ModelAndView manageSuppliers()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("isAdminClickedManageSupplires", true);
		return mv;
	}
	
	@GetMapping("/manage_products")
	public ModelAndView manageProducts()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("isAdminClickedManageProducts", true);
		return mv;
	}

}





