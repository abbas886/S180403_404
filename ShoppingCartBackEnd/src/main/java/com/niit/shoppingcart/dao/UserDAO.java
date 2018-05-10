package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.domain.User;

public interface UserDAO {
	
	//declare all required methods
	
	//CRUD Operations
	//Create, Retrieve, Update,  Delete,  fetch all records
	
	//with proper method signature
	//access_specifier return_type methodName(parameters)
	
	//1 save the record
	//return type is boolean
	//if the record is successfully saved - return true
	//else return false
	public boolean  save(User user);
	
	
	//2 delete the record
	
	public boolean delete(String emailID);
	
	//3 update the record
	public boolean update(User user);
	
	
	//4 get the record based on emailID
	public  User    get(String emailID);
	
	
	//5 get all records
	//will return list of user
	public  List<User>    list();
	
	//get all the users based on the role.
	public  List<User>    list(char role);
	
	
	//6 validate credentials
	//At present we are not using spring security
	//When we use spring security, we will remove this method
	public User validate(String emailID, String password);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
