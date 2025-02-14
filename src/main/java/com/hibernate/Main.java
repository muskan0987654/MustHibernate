package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



import com.hibernate.model.Employee;

public class Main {

	public static void main(String[] args) {

		Employee Karishma=new Employee("Karishma","Female",55000);   //persistence object
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sf=cfg.buildSessionFactory();
//		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.buildSessionFactory();
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(Karishma);
		tx.commit();
		
	} 

}
