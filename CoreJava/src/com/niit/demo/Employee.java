package com.niit.demo;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private Character gender;
	
	
	
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		gender = Character.toLowerCase(gender);
		
		if(gender!='m' || gender!='f')
		{
			System.out.println("Invalid Gender..please give again");
			gender=' ';
		}
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
		//if(role.euqlas("user")
		
		if(salary<10000 || salary>1000000 )
		{
			System.out.println("invalid salary");
			salary=10000;
		}
		
		this.salary = salary;
	}
	
	
	
	
	
	
	

}
