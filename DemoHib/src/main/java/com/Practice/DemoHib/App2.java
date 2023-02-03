package com.Practice.DemoHib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App2 {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		
		emp.setEid(101);
		emp.setEname("Bhavik Bhatia");
		emp2.setEid(102);
		emp2.setEname("Amit Trivedi");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();    	
    	SessionFactory factory = con.buildSessionFactory(registry);
    	
//		Level 2 Caching(With HQL)    	
    	Session session = factory.openSession();    	
    	Transaction tx = session.beginTransaction();
    	
    	Query q1 = session.createQuery("from Employee where eid=101");
    	q1.setCacheable(true);
    	System.out.println(q1.uniqueResult());
    	
    	tx.commit();
    	session.close();

//    	session.save(emp);
//    	session.save(emp2);	
    	
/*
   		//Level 1 Caching(Without HQL)    	
    	Employee e=(Employee)session.get(Employee.class, 101);
    	System.out.println(e);    	    	
    	e=(Employee)session.get(Employee.class, 101);
    	System.out.println(e);    	  
 */    	
  
/*
 		//Level 2 Caching(Without HQL)
    	Employee e=(Employee)session.get(Employee.class, 101);
    	System.out.println(e);    	    	
    	     	
    	tx.commit();
    	session.close();
    	
    	Session session2 = factory.openSession();    	
    	
    	e=(Employee)session2.get(Employee.class, 101);
    	System.out.println(e);    	  

    	session2.close();


*/
    	Session session2 = factory.openSession();
    	tx = session2.beginTransaction();
    	
    	Query q2 = session2.createQuery("from Employee where eid=101");
    	q2.setCacheable(true);
    	System.out.println(q2.uniqueResult());
    	
    	tx.commit();
    	session2.close();
    	factory.close();
    	
	}
}
