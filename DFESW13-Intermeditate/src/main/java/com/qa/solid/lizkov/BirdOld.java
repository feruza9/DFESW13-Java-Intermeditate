package com.qa.solid.lizkov;

public abstract class BirdOld {
	
	private int wingSpan; 
	private String colour;
	
	public BirdOld(int wingSpan, String colour) {
		super();
		this.wingSpan = wingSpan;
		this.colour = colour;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	// Create an abstract method for fly()
	public abstract void fly();
	
}
