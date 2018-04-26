package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

public class UserDAOImpl implements UserDAO {

	// Get the Sesion Factory
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(User user) {
		// get session from Session Factory
		// from SessionFactory
		// 1) Open new Session
		// 2) continue with Current Session
		try {
			sessionFactory.openSession().save(user);
		} catch (Exception e) {
			return false;
		}
		// above line : opening session saving user in user table.

		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(String emailID) {
		try {
			sessionFactory.getCurrentSession().delete(emailID, User.class);
		} catch (Exception e) {
			return false;
		}
		return true;

	}

	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (HibernateException e) {
			// if any exceptions, the complete error stack trace
			// will print on the console.
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public User get(String emailID) {
		//select * from User where emailID = ?
		
	return	(User) sessionFactory.getCurrentSession().get(emailID, User.class);
		
	}

	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	public boolean validate(String emailID, String password) {
		//will discuss tomorrow
		// TODO Auto-generated method stub
		return false;
	}

}
