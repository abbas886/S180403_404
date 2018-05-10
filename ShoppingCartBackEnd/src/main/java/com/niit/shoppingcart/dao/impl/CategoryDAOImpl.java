package com.niit.shoppingcart.dao.impl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;

///need to add  @Transactional
@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl  implements CategoryDAO{
	
	
	//Declare the SessionFactory -supposed automatically injected in the class
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(Category category) {
		try {
			//set the current system date to category
			category.setAdded_date(new Date(System.currentTimeMillis()));
			//save method will create new record
			//modify saveOrUpdate
			//saveOrUpdate - will save if it is new record
			//will update if is existing record.
			sessionFactory.getCurrentSession().saveOrUpdate(category);
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
			//before deleting,  check whether the record is exist or not
			//if the record does not exist, return false;
			Category category = get(name);
			if(category==null)
			{
				return false;
			}
			
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}

	public Category get(String name) {
		
	return	(Category) sessionFactory.getCurrentSession().get(Category.class,name);
		
	}

	public List<Category> list() {
		
	return	sessionFactory.getCurrentSession().createQuery("from Category").list();
		
	}

}









