package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.cfg.HibernateConfiguration;
import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {

		Employee Mohan=new Employee("Kashish","male",5800);   //persistence object
		
//		SessionFactory sf=HibernateConfiguration.getSessionFactory();
//		Session session=sf.openSession();
//		Transaction tx=session.beginTransaction();
//		session.save(Mohini);
//		tx.commit(); 
		
		
		Session session=HibernateConfiguration.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
//		session.persist(Mohan);
//		tx.commit();

		Employee emp=session.get(Employee.class, 4);
		System.out.println(emp);
		
//		System.out.println(session.get(Employee.class, 4));
	} 

}
