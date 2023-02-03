package com.Practice.DemoHib;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App4 {
	public static void main(String[] args) {
		Employee e  = new Employee();
		e.setEid(101);
		e.setEname("Bhavik Bhatia");
		
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();    	
    	SessionFactory factory = con.buildSessionFactory(registry);
    	Session session = factory.openSession();    	
    	Transaction tx = session.beginTransaction();

    	
    	//Specific Columns    	    	
    	SQLQuery query=session.createSQLQuery("select eid,ename from Employee;");    	
    	
    	List<Object[]> emp=query.list();
    	
    	for (Object[] employee : emp) {
			System.out.println(employee[0]);
			System.out.println(employee[1]);
		}    	
/*
    	//All Columns selected    	
    	SQLQuery query=session.createSQLQuery("select* from Employee;");
    	query.addEntity(Employee.class);
    	List emp=query.list();
    	
    	for (Object employee : emp) {
			System.out.println(employee);
		}
*/
    	
    	tx.commit();
    	session.close();

	}
}
