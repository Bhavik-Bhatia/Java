package com.Practice.DemoHib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App5 {

	public static void main(String[] args) {
		// JPA		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("p");
		EntityManager manager = factory.createEntityManager();
		
		Employee emp=manager.find(Employee.class, 101);
		System.out.println(emp);		
	}
}
