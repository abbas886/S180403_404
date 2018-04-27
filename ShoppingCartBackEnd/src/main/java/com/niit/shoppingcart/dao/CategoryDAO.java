package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.Category;

public interface CategoryDAO {
	
	//create, update, delete, get, list
	
	//access_specifier return_type methodName(parameters)
	
	//create
	public  boolean   save(Category category); 
	
	//update
	public  boolean   update(Category category); 
	
	//delete
	public boolean delete(String name);
	
	
	//get the category details based on name
	public Category get(String name);
	
	//get all the categories
	public List<Category>  list();
	
	
	
	
	

}
