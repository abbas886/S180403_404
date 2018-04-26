package com.niit.demo;

public class DemoTest {
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.add(10, 20);
		
	//System.out.println(demo.add(10, 20));
	//System.out.println(demo.add(demo.add(10, 20) , 30));
	
 /* System.out.println(demo.add(  demo.add(10, 20)  ,
		             demo.add(30, 40) ));*/
	/*	
		for(int i=2;i<=100;i++)
		{
			if(demo.isPrime(i))
			{
				System.out.print(i +" ");
			}
		}*/
	
		int n=6, r=2;
		
	int result = 	demo.getFactorial(6)  / 
		(demo.getFactorial(n-r) * demo.getFactorial(r));
	
	System.out.println(result);
		
		
		
	
	
		
		
		
		
	}

}
