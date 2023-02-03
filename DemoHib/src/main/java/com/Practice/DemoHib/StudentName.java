package com.Practice.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	
	private String FirstName;
	private String LastName;
	private String MiddleName;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	@Override
	public String toString() {
		return "StudentName [FirstName=" + FirstName + ", LastName=" + LastName + ", MiddleName=" + MiddleName + "]";
	}
	
}
