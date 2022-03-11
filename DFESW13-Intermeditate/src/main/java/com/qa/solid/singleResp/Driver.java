package com.qa.solid.singleResp;

public class Driver {
	
	private String name;

	public Driver(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public void drive(Car car) {
		System.out.println("Driving car " + car);
	}

}
