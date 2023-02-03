package com.Practice.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car implements Vehicle {
	
	String carName;	
	
	public Car(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Autowired
	Tyre tyre;
	
	public void drive() {
		System.out.println(carName+" car tyre company is: "+tyre.CompanyName());
	}
}
