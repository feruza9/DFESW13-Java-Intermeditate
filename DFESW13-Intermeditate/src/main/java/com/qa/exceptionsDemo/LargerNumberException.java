package com.qa.exceptionsDemo;

public class LargerNumberException extends Exception {
	
	// Generating a constructro from superclass within my Exception
	public LargerNumberException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
