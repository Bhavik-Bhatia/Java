package com.Practice.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {    	
    	
    	Student student = new Student();
    	Laptop laptop = new Laptop();
    	StudentName obj2 = new StudentName();
    	
    	obj2.setFirstName("Bhavik");
    	obj2.setMiddleName("Rajesh");
    	obj2.setLastName("Bhatia");    	

    	laptop.setLid(1);
    	laptop.setLname("Lenovo");

    	
    	student.setSid(101);
    	student.setSname(obj2);
    	student.getLaptop().add(laptop);
    	
/*
 *  //Many To Many
 *	student.getLaptop().add(laptop);
 *	laptop.getStudent().add(student);
 * 
 * */
    	
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();    	
    	SessionFactory factory = con.buildSessionFactory(registry);
    	Session session = factory.openSession();
    	
    	Transaction tx = session.beginTransaction();

    	session.save(student);
    	session.save(laptop);
    	
//    	Student s=(Student)session.get(Student.class, 101);
//    	System.out.println("Student Name: "+s.getSname());    	
    	
    	tx.commit();
    	session.close();
    	factory.close();
    	
    }
}
