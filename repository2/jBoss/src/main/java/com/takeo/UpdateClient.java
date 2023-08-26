package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.model.Customer;

public class UpdateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg= new Configuration();
cfg.configure();
		
SessionFactory factory =cfg.buildSessionFactory();

Session ses= factory.openSession();
Transaction tx= ses.beginTransaction();

Customer cust= new Customer();
cust.setCustId(105);
cust.setCustName("Victory");
cust.setCustAddress("USA");

Customer c= (Customer)ses.merge(cust);
	tx.commit();
	if (c!= null)
		System.out.println(c.getCustId()+"\t"+c.getCustName()+"\t"+c.getCustAddress()+"\t");

	}
}
