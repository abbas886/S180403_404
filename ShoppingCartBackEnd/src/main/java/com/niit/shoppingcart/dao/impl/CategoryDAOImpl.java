package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

///need to add  @Transactional
public class CategoryDAOImpl  implements CategoryDAO{
	
	
	//Declare the SessionFactory -supposed automatically injected in the class
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

	public boolean update(Category category) {

		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}

	public boolean delete(String name) {

		try {
			sessionFactory.getCurrentSession().delete(name,Category.class);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}

	public Category get(String name) {
		
	return	(Category) sessionFactory.getCurrentSession().get(name, Category.class);
		
	}

	public List<Category> list() {
		
	return	sessionFactory.getCurrentSession().createQuery("from Category").list();
		
	}

}









