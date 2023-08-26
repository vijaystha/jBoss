package com.takeo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.takeo.model.Customer;

public class App {

	public static void main(String[] args) {
		
		//create config class
		Configuration cfg= new Configuration();
		System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		//Step 2:  Build SessionFactory

		cfg.configure();
//		cfg.configure("/jBoss/src/main/java/com/takeo/config/hibernate.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();

	    //Step 3 :  Obtain/Open  a Session

	    Session ses=factory.openSession();

	    Transaction tx=ses.beginTransaction();


	    Customer cust=new Customer();//Transient State
	    cust.setCustId(103);
	    cust.setCustName("isha");
	    cust.setCustAddress("isha@yahoo.com");

	    //Step 4 : Persistence Operations

	    /*
	     * Integer id=(Integer)ses.save(cust);//persistence state
	     * 
	     * System.out.println("Generated id : "+id);
	     */
	    
	    
	    ses.persist(cust);
	    tx.commit();

	    ses.evict(cust);

	    ses.close();//detached state
		
//	    Query q=ses.createQuery("from Employee");
//
//	    List <Employee>empRecords = q.getResultList();
//	    for(Employee emp : empRecords)
//	    {
//	        System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail());
//	    }
	  //to fetch specific column

//        Query q=ses.createQuery("select email from Employee");
//        List <String>empRecords = q.getResultList();
        /*
         * for(String email : empRecords) { System.out.println(email); }
         */
//        empRecords.forEach(System.out::println);
	  //fetch Records from data base
//        Query q=ses.createQuery("from Employee");
//        List <Employee>empRecords = q.getResultList();
//        empRecords.stream().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail()));
	    
	  //Aggrigate functions avg(-),max(-),min(-),count(-)

//        Query q=ses.createQuery("select max(eno),min(eno),count(*) from Employee");
//
//        List <Object[]>empRecords = q.getResultList();
//
//        for(Object obj[]:empRecords)
//        {
//            System.out.println(obj[0]+"\t"+obj[1]+"\t"+obj[2]);
//        }
//	    Query q=ses.createQuery("update Employee set email=:mail where eno=:no   ");
//
//
//        q.setParameter("mail", "malliyannam@gmail.com");
//
//        q.setParameter("no",3);
//
//        int count=q.executeUpdate();
//
//        tx.commit();
//        if(count!=0)
//            System.out.println("Email is updated");
//        else
//            System.out.println("Record is not exist");
//	    
	    
//	    //to fetch specific column
//
//        Query q=ses.createQuery("select email from Employee");
//
//
//        List <String>empRecords = q.getResultList();
//
//
//        /*
//         * for(String email : empRecords) { System.out.println(email); }
//         */
//        empRecords.forEach(System.out::println);
	    
	    
	    
//        Query q=ses.createQuery("select email from Employee");
//
//
//        List <String>empRecords = q.getResultList();
//
//
//        /*
//         * for(String email : empRecords) { System.out.println(email); }
//         */
//        empRecords.forEach(System.out::println);
	}

}
