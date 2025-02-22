package com.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String items;
	
	@ManyToOne
	private Customer customer;

	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String items, Customer customer) {
		super();
		this.id = id;
		this.items = items;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", items=" + items + ", customer=" + customer + "]";
	}
	
	
}
