package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.User;

import junit.framework.Assert;

public class CategoryDAOTestCase {

private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private static Category category;
	
	
	@BeforeClass
	public static void initialize()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		category = (Category) context.getBean("category");
				
	}
	
	
	
	//write the test cases
	
	@Test
	public void saveCategoryTestCase()
	{
		category.setName("WoMen");
		category.setDescription("WoMen Category ");
		//category.setAdded_date(added_date);  Take system date
		//in CategoryDAOImpl
		//call save method and compare expected with actaul
		boolean actual =categoryDAO.save(category);
		
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void getCategorySuccessTestCase()
	{
		
	  Assert.assertNotNull(categoryDAO.get("Mobile"));
	}
	
	@Test
	public void getCategoryFailureTestCase()
	{
		
	  Assert.assertNull(categoryDAO.get("Books"));
	}
	
	
	@Test
	public void updateCategorySuccessTestCase()
	{
		category = categoryDAO.get("Mobile");
		//update the description.
		category.setDescription("New Mobile Category");
		Assert.assertEquals(true,  categoryDAO.update(category));
	}
	

	@Test
	public void updateCategoryFailureTestCase()
	{
		//Books category is not exist in our table
		category = categoryDAO.get("Books");
		//it supposed be return null
		Assert.assertNotNull(category);
		
		//update the description.
		category.setDescription("New Mobile Category");
		Assert.assertEquals(true,  categoryDAO.update(category));
	}
	
	
	@Test
	public void deleteCategorySuccessTestCase()
	{
		Assert.assertEquals(true,   categoryDAO.delete("Men"));
	}
	
	@Test
	public void deleteCategoryFailureTestCase()
	{
		Assert.assertEquals(false,   categoryDAO.delete("Baby"));
	}
	
	@Test
	public void getAllCategoriesTestCase()
	{
		//compare how many records are there in db and how many
		//are coming from dao.
	 Assert.assertEquals(2,	categoryDAO.list().size());
	}
	
	
	
	
	
	
	

}
