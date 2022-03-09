package com.qa.solid.interfaceSegregation;

// Interface Segregation is the principle of ensuring only the neccesary interfaces are used
// And you're only using the necessary methods from those interfaces

public class Latte implements Espresso {

	@Override
	public void makeEspresso() {
		System.out.println("Make espresso");
		
	}

	// We are using an interface which has more methods than we need for our class 
	
//	@Override
//	public void blendDrink() {
//		System.out.println("Not needed");
//	}
//
//	@Override
//	public void addWhippedCream() {
//		System.out.println("Not needed");
//		
//	}
//
//	@Override
//	public void makeChaiTea() {
//		System.out.println("Not needed");
//		
//	}
	
	

}
