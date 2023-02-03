package com.demo;

public class Students {
	int Id;
	String Name;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", Name=" + Name + "]";
	}
	
	public Students(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
}
