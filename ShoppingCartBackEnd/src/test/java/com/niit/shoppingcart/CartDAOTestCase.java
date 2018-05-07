package com.niit.shoppingcart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.domain.Cart;
import com.niit.shoppingcart.domain.Category;

import junit.framework.Assert;

public class CartDAOTestCase {

private static AnnotationConfigApplicationContext context;
	
	private static CartDAO cartDAO;
	
	private static Cart cart;
	
	
	@BeforeClass
	public static void initialize()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		cartDAO = (CartDAO)context.getBean("cartDAO");
		cart =  (Cart) context.getBean("cart");
				
	}
	
	
	
	
	@Test  public void addToCartTestCase()
	{
		cart.setEmailID("Namrata@gmail.com");
		cart.setProductName("Lenovo");
		cart.setPrice(15000);   //should get from product table.
		//cart.setAdded_date(added_date);  default should be today
		cart.setQuantity(4);  //default should be 1
		//cart.setStatus(status);  default 'N'
		Assert.assertEquals(true,  cartDAO.save(cart));
		
		
	}
	
	@Test
	public void updateCartTestCase()
	{
		
	Cart cart=	cartDAO.get(0);
	cart.setQuantity(5);
	Assert.assertEquals(true,  cartDAO.update(cart));
	
	}
	
	
	@Test
	public void getCartSuccessTestCase()
	{
	Assert.assertNotNull( cartDAO.get(0));
	}
	
	@Test
	public void getCartFailureTestCase()
	{
	Assert.assertNull( cartDAO.get(10));
	}
	
	
	
	@Test public void deleteCartTestCase()
	{
		Assert.assertEquals(true,	cartDAO.delete(0));
	}
	
	@Test public void productDispatchedTestCase()
	{
	cart=	cartDAO.get(3);
	cart.setStatus('D');
	Assert.assertEquals(true,cartDAO.update(cart));
	
	}
	
	@Test public void dispatchAllTheProductsTestCase()
	{
	List<Cart> carts = 	cartDAO.list("Namrata@gmail.com");
	Assert.assertEquals(true,cartDAO.update(carts,'D'));
		
	}
	
	@Test public void deliverAllTheProductsTestCase()
	{
	List<Cart> carts = 	cartDAO.list("Namrata@gmail.com");
	Assert.assertEquals(true,cartDAO.update(carts,'L'));
		
	}
	
	
	
	
	
	

}
