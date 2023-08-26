package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.model.Customer;

public class RetriveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		step 1: configuration object
		Configuration cfg= new Configuration();
		cfg.configure();
		
//		Step2: Build SessionFactory
		SessionFactory factory= cfg.buildSessionFactory();
		
//		step 3: open session
		Session ses= factory.openSession();
		Transaction tx= ses.beginTransaction();
		
//		fetch from data base
//		Customer cust =ses.get(Customer.class, 102);
//		
//		if(cust!= null)
//			System.out.println(cust.getCustId()+ "\t"+ cust.getCustName() + "\t" + cust.getCustAddress());
//		else
//			System.out.println("Record doesn't exist");
		Customer cust= ses.load(Customer.class, 102);
		if(cust!= null)
			System.out.println(cust.getCustId()+ "\t"+ cust.getCustName() + "\t" + cust.getCustAddress());
		else
			System.out.println("Record doesn't exist");	
	}

}
