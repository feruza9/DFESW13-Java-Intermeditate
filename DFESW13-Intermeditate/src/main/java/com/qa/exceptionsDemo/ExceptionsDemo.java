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
		} catch (Exception exception) { 
			System.out.println("This wont print");
			exception.printStackTrace(); // Print to the console the error
		} finally {
			System.out.println("This should now print!");
		}
		
	}
	
	
	// All methods CAN create exceptions
	// All methods SHOULD have a try catch block 
	// Null pointer exception - Try to interact with a variable that has not been initialised
	
	
	// within your projects, if you know you have an int that 
	// shouldn't go below 4, make an exception for it 
	public void makeCustomException() {
		try {
			int num = 5; 
			
			// if the value of num is over 2
			// create and throw a new custom exception
			if(num > 2) {
				throw new FancyException("fancy error message");
			}
		} catch (FancyException exception) {
			System.out.println("Catches FancyExceptions");
			exception.printStackTrace();
		} 
		// my second catch is unreachable because ALL code will 
		// be handled by Exception exception
		// FancyException IS OF TYPE Exception 
		catch (Exception exception) {
			System.out.println("Catches ALL Exceptions");
			exception.printStackTrace();
		}
		

		
	}
	
	

}
