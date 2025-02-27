package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.cfg.HibernateConfiguration;
import com.hibernate.model.Employee;
import com.hibernate.model.Address;


public class Main {

	public static void main(String[] args) {

		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		
		Employee e1=new Employee();
		e1.setName("Komal");
		e1.setGender("Female");
		e1.setSalary(35000);
		Employee e2=new Employee();
		e2.setName("Kirti");
		e2.setGender("Female");
		e2.setSalary(40000);
		Employee e3=new Employee();
		e3.setName("Karishma");
		e3.setGender("Female");
		e3.setSalary(50000);
		Employee e4=new Employee();
		e4.setName("Kusum");
		e4.setGender("Female");
		e4.setSalary(55000);
		
		
		List <Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
	
	
		Address p1=new Address();
		p1.setCity("Noida");
		p1.setState("UP");
		Address p2=new Address();
		p2.setCity("karnal");
		p2.setState("Haryana");
		Address p3=new Address();
		p3.setCity("Kurukshetra");
		p3.setState("Haryana");
		Address p4=new Address();
		p4.setCity("Delhi");
		p4.setState("Delhi");
		
			
		List <Address> p=new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		session.persist(p4);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		session.persist(e4);
	
		e2.setAddress(p);
		e1.setAddress(p);
		p1.setEmployee(e);
		p2.setEmployee(e);
	
	

		tx.commit();
		
	} 

}
