package com.qa.solid.openClosed;

// Our class IcedCoffee will implement our interface Drink
public class IcedCoffee implements Drink{

	@Override
	public String makeDrink() {
		return "put ice, coffee and espresson in a blender.. serve cold";
	}

}
