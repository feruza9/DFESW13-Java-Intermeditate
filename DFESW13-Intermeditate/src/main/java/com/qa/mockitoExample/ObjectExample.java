package com.qa.mockitoExample;

public class ObjectExample {
	
	private String shape;
	private String colour;
	
	public ObjectExample(String shape, String colour) {
		super();
		this.shape = shape;
		this.colour = colour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Object [shape=" + shape + ", colour=" + colour + "]";
	}
	
	


}
