package com.qa.optional;

import java.util.Optional;

public class Runner {
	
	public static void main(String[] args) {
//		OptionalDemo demo = new OptionalDemo();
		ActualOptionalDemo demo = new ActualOptionalDemo();
		
		// method is adding the data to our list
		demo.addToList();
		
		// if the colour is in the list, return an Optional containing it
		System.out.println(demo.findColour("red")); 
		System.out.println(demo.findColour("blue"));
		
		// if the colour is not in the list, return optional.empty
		System.out.println(demo.findColour("purple"));
		
		// This saves the values as an Optional<String>
		Optional<String> foundColour = demo.findColour("purple");
		System.out.println(foundColour);
		
		
		// If the optional contains red, save the value as "red" 
		// if the optional contains something else (null) return "other colour"
		String colourString = foundColour.orElse("other colour");
		
		System.out.println(colourString);
		
		
	
		
//		System.out.println(demo.optionalPractice());
	}

}
