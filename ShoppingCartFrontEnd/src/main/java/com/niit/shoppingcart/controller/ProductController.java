package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.domain.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private Product product;
	
	@Autowired
	private HttpSession httpSession;

	@PostMapping("product/save")
	public ModelAndView saveProduct(
			@RequestParam String name, 
			@RequestParam String description,
			@RequestParam String price,
			@RequestParam String id,
			@RequestParam String cateoryName
			) {

		ModelAndView mv = new ModelAndView("redirect:/manage_products");
		product.setDescription(description);
		product.setName(name);
		product.setId(id);
		product.setCategory_name(cateoryName);
		//String value should be converted into integer
		
		product.setPrice(Integer.parseInt(price));
		
		// need to write one more condition.
		if (productDAO.save(product)) {
			mv.addObject("message", "Product created Successfully");
			return mv;
		} else {
			mv.addObject("message", "Could not create product.");

		}
		return mv;

	}
	
	
	@GetMapping("/product/delete")
	public ModelAndView deleteProduct(@RequestParam String id)
	{
		ModelAndView mv = new ModelAndView("redirect:/manage_products");
		
		if(productDAO.delete(id))
		{
			mv.addObject("message", "The product successfully deleted");
		}
		else
		{
			mv.addObject("message", "Could not delete the product.  Please try after some time.");
		}
		return mv;
	}
	
	
	
	
	@GetMapping("/product/edit/")
	public String editProduct(@RequestParam String id)
	{
		//ModelAndView mv = new ModelAndView("redirect:/manage_products");
		product = productDAO.get(id);
		
		//mv.addObject("product", product);
		httpSession.setAttribute("selectedProduct", product);
		
		//why we need to have mv as we are using httpSession;
		
		//return mv;
		
		return "redirect:/manage_products";
	}
	
	
	
	
	
	
	
	
	
	

}
