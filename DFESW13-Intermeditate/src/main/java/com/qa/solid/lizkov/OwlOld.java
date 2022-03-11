package com.qa.solid.lizkov;

public class OwlOld extends BirdOld {

	// Added my bird superConstructor
	public OwlOld(int wingSpan, String colour) {
		super(wingSpan, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying high in the sky!");
		
	}
	
	

}
