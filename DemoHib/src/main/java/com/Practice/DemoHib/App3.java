package com.Practice.DemoHib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App3 {
	
	public static void main(String[] args) {
		
		Employee e  = new Employee();
		e.setEid(101);
		e.setEname("Bhavik Bhatia");
		
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();    	
    	SessionFactory factory = con.buildSessionFactory(registry);
    	Session session = factory.openSession();    	
    	Transaction tx = session.beginTransaction();
    	
    	
    	/*  --------------------------------------------------------------
    	 *  HQL
    	 *  --------------------------------------------------------------
    	 *  
    	 *  1)Query query=session.createQuery("from Employee");
    	 *  2)Query query=session.createQuery("from Employee where eid=102");
    	 *  3)Query query=session.createQuery("select ename from Employee where eid=102");
    	 *  4)Query query=session.createQuery("select eid,ename from Employee");
    	 *  5)Query query=session.createQuery("select count(eid) from Employee");
    	 *  6)Query query=session.createQuery("select ename from Employee where eid=:i");
    		  query.setParameter("i", 102);
    	 */
    	
    	Query query=session.createQuery("select ename from Employee where eid=:i");
    	query.setParameter("i", 102);
    	
    	Object student=(Object) query.uniqueResult();
    	System.out.println(student);	
    	
//		For Unique Results    	
//    	Employee emp = (Employee) query.uniqueResult();
//    	System.out.println(emp);

    	
//		For List of Results
//    	List<Employee> result=query.list();
//    	for (Employee employee : result) {
//			System.out.println(employee);
//		}

    	
//		For Specific Columns but unique results    	
//    	Object[] student=(Object[]) query.uniqueResult();
//    	for (Object object : student) {
//    		System.out.println(object);	
//		}
    	
//		For Specific Columns but list of results
//    	List<Object[]> student=query.list();
//    	for (Object[] objects : student) {
//			System.out.println("Eid: "+objects[0]);
//			System.out.println("Ename: "+objects[1]);
//		}
    	    	    	
    	tx.commit();
    	session.close();
    	
	}
}
