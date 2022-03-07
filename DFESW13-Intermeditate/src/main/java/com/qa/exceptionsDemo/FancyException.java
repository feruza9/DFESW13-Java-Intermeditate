package com.qa.exceptionsDemo;

// Exceptions are just regular Java classes
public class FancyException extends Exception {

	// create an exception object with an error message
	public FancyException(String string) {
		super(string); // uses the Exception parent class and passes in a string
	}

}
