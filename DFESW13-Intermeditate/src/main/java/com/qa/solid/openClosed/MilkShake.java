package com.qa.solid.openClosed;

// milkshake is of type Drink AND Dessert
public class MilkShake implements Drink, Dessert {

	@Override
	public String makeDessert() {
		return "Make a thick milkshake for dessert";
	}

	@Override
	public String makeDrink() {
		// TODO Auto-generated method stub
		return "Make a milkshake for drink";
	}

}
