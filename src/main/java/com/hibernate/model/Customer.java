package com.hibernate.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	int id;
	private String name,gender;
	int amount;
	
	@OneToMany
	List<Products> products;
	
	public Customer( String name, String gender, int amount,List<Products> address) {
		super();
		this.name = name;
		this.gender = gender;
		this.amount = amount;
		this.products=products;
	}
	
	
	public List<Products> getProducts() {
		return products;
	}


	public void setAddress(List<Products> products) {
		this.products = products;
	}




	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAmount() {
		return amount;
	}

	public void setSalary(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", amount=" + amount + "]";
	}
	
	
	

}

