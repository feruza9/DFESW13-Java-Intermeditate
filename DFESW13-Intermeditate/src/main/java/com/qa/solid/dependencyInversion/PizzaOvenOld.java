package com.qa.solid.dependencyInversion;

public class PizzaOvenOld {
	
	// Creating a method to cook the pizza, will take in the pizza object, and print "cooked"
	
	public void cookPizza(PizzaOld pizza) {
		System.out.println(pizza.getToppings() + " is being cooked right now");
	}

}
