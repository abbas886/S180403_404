package com.niit.demo;

public class Scope {
	//scope of y is instance level
	static int y;
	
	//share the data among all instacle
	
	
	public void setY(int y)
	{
		this.y=y;
	}
	public int get()
	{
		return y;
	}
	
	public static void main(String[] args) {
		Scope s1 = new Scope();
		Scope s2 = new Scope();
		s1.setY(100);
		
		System.out.println(s2.get());
		
	}
	
	
	

}
