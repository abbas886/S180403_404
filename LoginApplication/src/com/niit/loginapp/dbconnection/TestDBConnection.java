package com.niit.loginapp.dbconnection;

import java.sql.Connection;

public class TestDBConnection {
	
	public static void main(String[] args) {
	//	DBConnection con = new DBConnection();
		Connection con = DBConnection.getDBConnection();
		
		if(con==null)
		{
			System.out.println("Could not connect to Database");
		}
		else
		{
			System.out.println("Connection established successfully");
		}
		
	}

}
