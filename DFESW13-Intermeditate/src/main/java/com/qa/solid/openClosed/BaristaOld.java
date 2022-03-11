package com.qa.solid.openClosed;

// Principle of Open / Closed means 
// Open for Extension - Adds MORE functionality
// Closed for Modification - Not able to Change or modify existing code
// Generally you need to increase functionality as app grows 
// Previous code has likely been tested, you don't want to rewrite code and testing

public class BaristaOld {
	
	public void makeLatte() {
		System.out.println("Make Espresso");
		System.out.println("Make frothy milk");
		System.out.println("Combine espresso and frothy milk");
	}
	
	public void makeTea() {
		System.out.println("use tea bag to make cup of tea");
	}
	
	// If we want to extend the functionality of this class, we must add more methods 
	// Add new tests for new methods in the original Barista Test file 

}
