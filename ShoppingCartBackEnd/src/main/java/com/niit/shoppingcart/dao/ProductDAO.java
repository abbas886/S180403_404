package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.Product;

public interface ProductDAO {
	
	//create, update, delete, get, list
	
	//access_specifier return_type methodName(parameters)
	
	//create
	public  boolean   save(Product product); 
	
	//update
	public  boolean   update(Product product); 
	
	//delete
	public boolean delete(String id);
	
	
	//get the product details based on name
	public Product get(String id);
	
	//get all the categories
	public List<Product>  list();
	
	
	
	
	

}
