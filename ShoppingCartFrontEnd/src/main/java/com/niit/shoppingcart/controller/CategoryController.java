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

		ModelAndView mv = new ModelAndView("home");
		category.setDescription(description);
		category.setName(name);
		// need to write one more condition.
		if (categoryDAO.save(category)) {
			mv.addObject("message", "Category created Successfully");
			//load all categories again
			//and set to httpSession
			//get all the categories categoryDAO.list()
			List<Category> categories=	categoryDAO.list();
			
			//will be available only in HomeController and Home.jsp
			//mv.addObject("categories", categories);
			
			//categories should be available in all resources
			httpSession.setAttribute("categories", categories);
			return mv;
		} else {
			mv.addObject("message", "Could not create category.");

		}
		return mv;

	}

}
