package com.qa.coinFlip;

// Enums are a seperate file type, and are used when you want a set value between a set of options
// When you want a finite list of options

// Flip a coin: Heads, tails, Edge 
// Six Sided Dice: 1, 2, 3, 4, 5, 6
// Drink orders: latte, mocha, chai tea

public enum CoinFlip {
	
	// in all caps (ENUMS ARE ALWAYS IN CAPS)
	
	// Empty objects
	HEADS, TAILS, EDGE; 

}

// Each file should only have one class, enum, interface etc 
//public enum Drinks {
//	
//	LATTE(milk, medium), 
//	MOCHA(choc, large),
//	CHAITEA(tea, small);
//	
//	private String type; // milk, choc, tea
//	private String size; // medium, large small
//	
//	private Drinks(String type, String size) {
//		this.type = type;
//		this.size = size;
//	}
//}
