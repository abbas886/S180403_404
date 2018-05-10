package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private Category category;
	
	@Autowired
	private HttpSession httpSession;

	@PostMapping("category/save")
	public ModelAndView saveCategory(@RequestParam String name, @RequestParam String description) {

		ModelAndView mv = new ModelAndView("redirect:/manage_categories");
		category.setDescription(description);
		category.setName(name);
		// need to write one more condition.
		if (categoryDAO.save(category)) {
			mv.addObject("message", "Category created Successfully");
			return mv;
		} else {
			mv.addObject("message", "Could not create category.");

		}
		return mv;

	}
	
	
	@GetMapping("/category/delete")
	public ModelAndView deleteCategory(@RequestParam String name)
	{
		ModelAndView mv = new ModelAndView("redirect:/manage_categories");
		
		if(categoryDAO.delete(name))
		{
			mv.addObject("message", "The category successfully deleted");
		}
		else
		{
			mv.addObject("message", "Could not delete the category.  Please try after some time.");
		}
		return mv;
	}
	
	
	
	
	@GetMapping("/category/edit/")
	public String editCategory(@RequestParam String name)
	{
		//ModelAndView mv = new ModelAndView("redirect:/manage_categories");
		category = categoryDAO.get(name);
		
		//mv.addObject("category", category);
		httpSession.setAttribute("selectedCategory", category);
		
		//why we need to have mv as we are using httpSession;
		
		//return mv;
		
		return "redirect:/manage_categories";
	}
	
	
	
	
	
	
	
	
	
	

}
