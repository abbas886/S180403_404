package com.niit.loginapp.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private static final String name = "sa";
	private static final String password = "";
	private static final String driver = "org.h2.Driver";
	private static final String url = "jdbc:h2:tcp://localhost/~/SPS180403";
	
	private DBConnection()
	{
		//private constructor to restrict using new key word
		
	}
	
	
	public static Connection   getDBConnection()
	{
		
		//load the driver. -  class 
		try {
			Class.forName(driver);
			//get the connection from DriverManager 
			return DriverManager.getConnection(url, name, password);
			
		} catch (ClassNotFoundException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void closeConnection(Connection con, ResultSet rs, Statement st, PreparedStatement pst)
	{
		try {
			if(con!=null)
			{
				con.close();
			}
			if(rs!=null)
			{
				rs.close();
			}
			if(st!=null)
			{
				st.close();
			}
			if(pst!=null)
			{
				pst.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}













