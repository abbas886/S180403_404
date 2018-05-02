package com.niit.demo;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setId(1010);
		emp.setName("Raghavendra");
		emp.setSalary(50000000);
		emp.setGender('A');
		
		//emp.gender='A';
		//emp.salary=-50000;
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getGender());
		
	}

}
