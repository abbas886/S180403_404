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
	
	
	//search for all products under certain amount
	
	//public List<Product> list(int amount);
	
	//search for all product where the cost is between 10k and 20k
	
	//public List<Product> list(int minAmount, int MaxAmout);
	
	//search for all particular products 
	//where the cost is between min and max
	
	//public List<Product> list(String productName, int minAmount, int MaxAmout);
	
	
	
	

}
