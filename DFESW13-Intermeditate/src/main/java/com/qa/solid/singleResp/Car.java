package com.qa.solid.singleResp;

public class Car {
	
	private int wheels;
	private String colour;
	private int mileage;
	
	public Car(int wheels, String colour, int mileage) {
		super();
		this.wheels = wheels;
		this.colour = colour;
		this.mileage = mileage;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	} 
}
