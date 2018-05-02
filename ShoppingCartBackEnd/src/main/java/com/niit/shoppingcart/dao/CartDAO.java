package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.Cart;

public interface CartDAO {
	
	//add a product to cart
	
	public boolean save(Cart cart);
	
	public boolean update(Cart cart);
	
	public boolean delete(int id);
	
	//get my products which added to mycart
	//select * from Cart where emailID = ?
	public  List<Cart>  list(String emailID);
	
	
	

}
