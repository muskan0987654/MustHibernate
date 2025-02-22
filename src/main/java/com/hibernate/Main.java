package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.cfg.HibernateConfiguration;
import com.hibernate.model.Address;
import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {

		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Address ad=new Address();
		ad.setCity("Delhi");
		ad.setState("Delhi");
		Employee Kashish=new Employee("Kashish","Female",44000);
		
		
		Kashish.setAddress(ad);
		ad.setEmployee(Kashish);
		
		
		session.persist(Kashish);
//		session.persist(ad);      //we use here mappedby annotation so we can connect 2 tables with 1 foreign key
		
		tx.commit();
		
		
	} 

}
