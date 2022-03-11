package com.qa.solid.openClosed;

public class Barista {
	
	// our barista has a method to run the makeDrink() of our drinks
	public void serveDrink(Drink drink) {
		System.out.println(drink.makeDrink());
	}
	
	// kind of goes against single responsibility
	public void serveDessert(Dessert dessert) {
		System.out.println(dessert.makeDessert());
	}

}
