package com.qa.solid.dependencyInversion;

public class Pizza {

	private String toppings;
	private int slices;
	private boolean stuffedCrust;

	public Pizza(String toppings, int slices, boolean stuffedCrust) {
		super();
		this.toppings = toppings;
		this.slices = slices;
		this.stuffedCrust = stuffedCrust;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	}

	@Override
	public String toString() {
		return "PizzaOld [toppings=" + toppings + ", slices=" + slices + ", stuffedCrust=" + stuffedCrust + "]";
	}
	
	// Cook Pizza method which returns a PizzaOrder 
	public void prepPizza(PizzaOrder order) {
		// Takes in type of pizza order
		// passes in this Pizza Object into the cookPizza function in the interface 
		// this - the current object for the specific method 
		// pizza4 - prepPizza -> order.cookPizza(pizza4);
		order.cookPizza(this);
	}

}
