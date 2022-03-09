package com.qa.solid.dependencyInversion;

public class PizzaOld {
	
	private String toppings;
	private int slices;
	private boolean stuffedCrust;
	
	public PizzaOld(String toppings, int slices, boolean stuffedCrust) {
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
}
