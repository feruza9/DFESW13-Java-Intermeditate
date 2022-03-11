package com.qa.solid.dependencyInversion;

public class PizzaOven implements PizzaOrder {

	// PizzaOven still takes in of type Pizza
	// But it implements it from the PizzaOrder method
	
	@Override
	public String cookPizza(Pizza orderPizza) {
		return orderPizza.getToppings() + " cooked!";
	}

}
