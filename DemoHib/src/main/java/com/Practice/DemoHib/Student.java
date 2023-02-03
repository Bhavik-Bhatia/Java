package com.Practice.DemoHib;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="StudentHib")
public class Student {
	
	@Id
	private int Sid;
	private StudentName Sname;
	
	@OneToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
/*	//One Student with multiple Laptop (RESULT: Will create 2 Tables)
 * 
 *	@OneToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>(); 
 * 
*/
	
/*

	//Many Students will have Many Laptops (RESULT: Will create 3 Tables)
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>();	

*/
	
	
	public int getSid() {
		return Sid;
	}
	
	public void setSid(int sid) {
		Sid = sid;
	}
		
	public StudentName getSname() {
		return Sname;
	}
	
	public void setSname(StudentName sname) {
		Sname = sname;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

/*
 	//One Student with multiple Laptop (RESULT: Will create 2 Tables)
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

*/
		
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + "]";
	}

/*
 * 	//Many Students will have Many Laptops (RESULT: Will create 3 Tables)
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}	
*/	
}
