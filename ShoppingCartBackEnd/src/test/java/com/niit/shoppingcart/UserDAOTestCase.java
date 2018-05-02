package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

public class UserDAOTestCase {

	//you supposed to get UserDAO Bean, so that you can call
	//save/update/delete/get/validate methods
	
	//context.getBean("userDAO")
	//you supposed to get bean only once
	
	private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private static User user;
	
	
	@BeforeClass
	public static void initialize()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		user = (User) context.getBean("user");
				
	}
	
	
	
	@Test
	public void saveUserTestCase()
	{
		user = new User();
		user.setEmailID("Subham@gmail.com");
		user.setName("Subham Kumar");
		user.setPassword("subham@123");
		user.setRole('C');
		user.setMobile("555555");
		user.setAddress(" M Borivali");
		
		
		
		boolean result = userDAO.save(user);
		Assert.assertEquals("save user",true,result );
	}
	
	@Test
	public void validateCredentialsSuccess()
	{
		//if the credentials are correct - will return user object
		//else will return null
		user = userDAO.validate("Prabhat@gmail.com", "prabhat@123");
		
		//expecting is not null   --will compare with actual -- user
		Assert.assertNotNull("validate test case" , user);
	}
	
	@Test
	public void validateCredentialsFailure()
	{
		//if the credentials are correct - will return user object
		//else will return null
		user = userDAO.validate("Prabhat@gmail.com", "prabhat@1234");
		
		//expecting is not null   --will compare with actual -- user
		Assert.assertNull("validate test case" , user);
	}
	
	@Test
	public void deleteUserTestCase()
	{
		boolean actual = userDAO.delete("Prabhat1@gmail.com");
		Assert.assertEquals(" delete user test case",true, actual);
	}
	
	@Test
	public void getUserTestCase()
	{
	user=	userDAO.get("Prabhat1@gmail.com");
	Assert.assertNotNull(user);
	}
	
	@Test
	public void updateUserTestCase()
	{
	user=	userDAO.get("Rakesh@gmail.com");
	user.setAddress(" Rajaji Nagar");
	
	
	boolean actual = userDAO.update(user);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void getAllUsers()
	{
		int size = userDAO.list().size();
		
		Assert.assertEquals(3, size);
	}
	
}







