package com.qa.solid.dependencyInversion;

// bridges the gap between Pizza AND PizzaOven
// PizzaOven will implement PizzaOrder, Pizza will become a PizzaOrder
public interface PizzaOrder {
	
	// Abstract method called cookPizza, which takes in object of type Pizza
	public String cookPizza(Pizza orderPizza);

}
