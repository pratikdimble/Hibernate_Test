npackage com.pratik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pratik.Emp;

public class ClientApp_Get {

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
    //set the values to domain or entity class for getting the record
		em=ses.get(Emp.class, 1001);
		
		
		if(em!=null)
		{
			System.out.println("===Record Found ===");
			System.out.println("\t"+em.getEid()+"\t"+em.getEname()+"\t"+em.getEsalary()+"\t"+em.getEcity());
		}
		else
		{
			System.out.println("Record Not Found");
		}
    //close the resources
		ses.close();
		factory.close();

				
		System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

	}

}
