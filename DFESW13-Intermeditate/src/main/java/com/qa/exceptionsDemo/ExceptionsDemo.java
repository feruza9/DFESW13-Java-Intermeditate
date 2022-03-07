package com.qa.exceptionsDemo;

public class ExceptionsDemo {
	
	// Intentionally make an error in my code
	
	public void makeError() {
		// If I want to create an array of ints, what do I put after the word int? 
		int[] numArray = {1,2,3};
		
		System.out.println(numArray[5]); // index error, array out of bounds 
		// When we get an error, the code stops completely
		// What happens if your java banking app has a simple error
		// and someone is halfway through submitting a report
		
		System.out.println("will this print?");
	}
	
	public void makeException() {
		
		// anything within the try {} is what the method attempts to do
		// 'try do this code' 
		try {
			int[] numArray = {1,2,3};
			System.out.println(numArray[5]);
			
		// anything within the catch {} is what to do if the try creates an error
		// 'catch this error and do something with it'
		// If you catch an object of type exception, do this thing	
		} catch (Exception zipZoop) { 
			zipZoop.printStackTrace(); // Print to the console the error
		} finally {
			System.out.println("This should now print!");
		}
		
	}
	
	public void nullPointer() {
		String name = "reece"; // equal to null
		System.out.println(name); // you cant print out or access null
	}
	
	// All methods CAN create exceptions
	// All methods SHOULD have a try catch block 
	// Null pointer exception - Try to interact with a variable that has not been initialised
	// Exercise - Create a method that creates a null pointer exception
	// 			- handles this exception with a catch block
	// 			- print out "exception handled" in a finally block

}
