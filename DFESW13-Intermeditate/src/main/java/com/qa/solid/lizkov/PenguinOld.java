package com.qa.solid.lizkov;

public class PenguinOld extends BirdOld {

	public PenguinOld(int wingSpan, String colour) {
		super(wingSpan, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// Can a penguin fly? .. Maybe, if it tried hard, but generally no
		throw new UnsupportedOperationException(); // Throws an exception because penguins can't fly 
	}
	
	// Failing the Lizkov principle 
	// Lizkov - When accessing the methods of a parent (bird) class, the compiler should be able to 
	// access them via the child class (penguin)

}
