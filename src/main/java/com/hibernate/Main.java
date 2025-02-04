package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {

		Employee Karishma=new Employee("Karishma","Female",55000);   //persistence object
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(Karishma);
		tx.commit();
		
	} 

}
