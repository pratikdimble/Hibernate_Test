package com.pratik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pratik.Emp;

public class ClientApp_Save {

	public static void main(String[] args) {


		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Emp em = null;
		Transaction tx = null;
//Activate the hibernate framw=ework
		cfg = new Configuration();
		cfg = cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
    //build the session factory
		    factory = cfg.buildSessionFactory();
    //open/ get the session
		    ses = factory.openSession();
    //create the domain class object
		    em = new Emp();
    //set the values to dimain or entity class
	    	em.setEid(1001);
	      	em.setEname("pratik");
	          	em.setEsalary(40000f);
	              	em.setEcity("Pune");

		try {
    //begin the transaction
			  tx = ses.beginTransaction();
      //save the object
			    ses.save(em);
      //commit the transaction
			    tx.commit();
			        System.out.println("object is saved");
		} catch (Exception e) {
			tx.rollback();

		}
    //close the resources
		ses.close();
		factory.close();

				
		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

	}

}
