package com.qa.solid.singleResp;

public class Mechanic {
	
	private String garageName;

	public Mechanic(String garageName) {
		super();
		this.garageName = garageName;
	}

	public String getGarageName() {
		return garageName;
	}

	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}
	
	public void fixVehicle(Car car, Driver customer) {
		System.out.println("Fixing " + customer + " " + car);
	}

}
