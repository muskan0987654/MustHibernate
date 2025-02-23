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
import com.hibernate.model.Customer;
import com.hibernate.model.Products;


public class Main {

	public static void main(String[] args) {

		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		
		Customer c1=new Customer();
		c1.setName("Komal");
		c1.setGender("Female");
		c1.setAmount(4500);
	
		Products p1=new Products("Shirt");
		Products p2=new Products("Shoes");
		Products p3=new Products("Pants");
		Products p4=new Products("T-Shirts");
		Products p5=new Products("Trowsers");
		
		p1.setCustomer(c1);
		p2.setCustomer(c1);
		p3.setCustomer(c1);
		p4.setCustomer(c1);
		p5.setCustomer(c1);
		
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		session.persist(p4);
		session.persist(p5);
		
		List <Products> p=new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);

		c1.setProducts(p);
		
		session.persist(c1);
		tx.commit();
		
	} 

}
