package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.model.Customer;

public class DeleteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Configuration cfg= new Configuration();
		cfg.configure();
		
	SessionFactory factory= cfg.buildSessionFactory();
	Session ses= factory.openSession();
	
	Transaction tx=ses.beginTransaction();
	Customer cust = ses.get(Customer.class, 103);
	if(cust!= null) {
//		ses.delete(cust);
		cust.setCustAddress("ASya");
		ses.update(cust);
		tx.commit();
		System.out.println("record is deleted successfully");
	}else
	System.out.println("Record doesn't exist");
	}

}
