package com.niit.loginapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.niit.loginapp.dbconnection.DBConnection;

//we supposed to create UserDAO interface
//and implement in UserDAOImpl class
public class UserDAO {
	//we need to connect to User table
	//and validate the credentials - true or false
	
	//CRUD Operations
	
	//define validate method
	//supposed to take two parameters id, password
	//return true or false
	
	public boolean validate(String id, String password)
	{
		//get db connection
	Connection con=	DBConnection.getDBConnection();
	PreparedStatement pSt;
	ResultSet result
	//create statements  
	try {
		//Statement ->  for static queries ( without where conditions)
		/*Statement st = con.createStatement();
		//select * from user where name ='Anamika' and password ='an@123'
		String query = "select * from user where name ='"+id+
				"' and password ='"+password+"'";*/
		
		//PreparedStatements -> dynamic quersy (having where conditions
		String query ="select * from user where name =? and password =?";
		pSt=con.prepareStatement(query);
		
		//replace 1st ? with id in a given query
		pSt.setString(1, id);
		//replace 2nd ? with password in a given query
		pSt.setString(2, password);
		
		result = pSt.executeQuery();
		//if there is any record exist , the method next() will return true
		if(result.next())
		{
			//valid credentials
			return true;
		}
		else
		{
			return false;
		}
		
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}finally
	{
		DBConnection.closeConnection(con, result, null, pSt);
	}
		
		
		
		
	}
	
	
	
	

}










