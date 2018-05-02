package com.niit.shoppingcart.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//we have to write Annotations
//1)To get Singleton instance
//2)To specific that it is not normal class -- to map to a table
@Component   //will create instance of User class --- user
@Table       //This User class will map to User Table
@Entity     //which map to a table
public class User {
	
	//we specified this User to should map to User Table
	//by using class level annotaion - @Table
	
	
	//we supposed to specify which property of this class
	//should map to which field of the table.
	
	//specify which is the primary key
	
	@Id    //this is primary key
	private String emailID;
	
	
	//@Column - to map property of the class to field of the table.
	//@Column is optional.  If the property name in the class
	//  is same as field name in the table.
	//@Column(name="password")
	private String password;
	
	private String name;
	
	private String address;
	
	private String mobile;
	
	private Date  added_date;
	
	private Character role;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public Character getRole() {
		return role;
	}

	public void setRole(Character role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}











