package com.niit.shoppingcart.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component   //will create instance of User class --- user
@Table 
@Entity
public class Product {
	
	@Id
	private String id;
	
	private String name;
	
	private String description;
	
	private int price;
	
	private Date added_date;
	
	@ManyToOne
	@JoinColumn(name = "category_name", updatable = false, insertable = false, nullable = false)
	private Category category;

	
	//other annotations - @OneToMany  @ManyToOne
	//
	private String category_name;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getAdded_date() {
		return added_date;
	}

	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
