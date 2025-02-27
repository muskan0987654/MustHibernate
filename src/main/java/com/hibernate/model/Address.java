package com.hibernate.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String City;
	private String State;
	
	@ManyToMany
	List<Employee> employee;

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address( String City,String State,List<Employee> employee) {
		super();
		this.City = City;
		this.State = State;		
		this.employee=employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> Employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", City=" + City + ", State=" + State + "]";
	}
	
}
