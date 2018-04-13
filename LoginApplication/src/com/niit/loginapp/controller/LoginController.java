package com.niit.loginapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.loginapp.dao.UserDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// access the values which entered in id and password field
		String id = request.getParameter("userID");
		String pwd =  request.getParameter("password");

		RequestDispatcher  dispatcher;
	
		// tempororiy assuming the id : niit and password:niit@123
		// are valid credentials. - later will intergate with db
		//create UserDAO instance
		UserDAO userDAO = new UserDAO();
		//call validate method
		boolean status =userDAO.validate(id, pwd);
		if (status==true) {
			dispatcher =request.getRequestDispatcher("home.html");
			dispatcher.forward(request, response);
		} else {
			dispatcher =request.getRequestDispatcher("login.html");
		//SOP - which will print on console.
			//we should display message on the browser  - PrintWriter
			PrintWriter writer = response.getWriter();
			writer.append("Invalid Credentials...please try again.");
			
			dispatcher.include(request, response);
			//show error message - will discuss tomorrow.
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 copy the code from doGet and paste here.
		// OR 2 call doGet method from doPost method

		doGet(request, response);

	}

}
