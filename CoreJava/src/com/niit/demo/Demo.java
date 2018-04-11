package com.niit.demo;

public class Demo {
	
	
	//complete method signature
	//access_specifier return methodName(parameter_st) throws exception_list
	
	public int add(int x , int y)
	{
		return x+y;
	}
	
	
	
	
	
	
	
	
	public boolean isPrime(int x)
	{
		for(int i=2 ;i <=x/2; i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public int getFactorial(int x)
	{
		int fact=1;
		for(int i=2; i<=x;i++)
		{
			fact=fact*i;
		}
			
		return fact;
		
	}
	
	
	
	

}













