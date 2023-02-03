package com.Practice.DemoHib;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int Lid;
	private String Lname;
	
	@ManyToOne
	private Student student;

/*
	//Many Laptops with One Student(RESULT: Will create 2 Tables)
	@ManyToOne
	private Student student;
*/
	
/*	//Many Students will have Many Laptops (RESULT: Will create 3 Tables)
 *	@ManyToMany
	private List<Student> student=new ArrayList<Student>(); 
 * 
 * 
 * */
	
	
	public int getLid() {
		return Lid;
	}
	
	public void setLid(int lid) {
		Lid = lid;
	}
	
	public String getLname() {
		return Lname;
	}
	
	public void setLname(String lname) {
		Lname = lname;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	

/*	
 * //Many Laptops with One Student(RESULT: Will create 2 Tables)
 * 	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	
*/	
	
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}

	
/*
 * //Many Students will have Many Laptops (RESULT: Will create 3 Tables)
	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
*/	
	
}
