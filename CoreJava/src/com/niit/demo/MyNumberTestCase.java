package com.niit.demo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class MyNumberTestCase {
	
	private static MyNumber number;    //=new MyNuber()
	@BeforeClass
	public static void init()
	{
		System.out.println("MyNumber class is going to instantiate");
		number = new MyNumber();
	}

	@Test
	public void addTestCase()
	{
		int result = number.add(10, 20);
		//will compare expected with actual
		//if it returns true - OK
		//else will not execute the remaining statements
		//will through AsserError
		Assert.assertEquals("Add test case",  30, result);
	}
	@Test
    public void substractTestCase()
    {
    	int result  = number.substract(20, 10);
    	Assert.assertEquals("Substract test case", 10,result);
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
