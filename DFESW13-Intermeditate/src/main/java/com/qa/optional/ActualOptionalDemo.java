package com.qa.optional;

import java.util.ArrayList;
import java.util.Optional;

// Optionals are Wrapper classes that are used to contain data that may or may not be null 
// They are used to allow you to interact with data that may be null, without causing an exception 
// Rather than accessing the data, you access the Optional that contains the data 
public class ActualOptionalDemo {
	
	private ArrayList<String> colourList = new ArrayList<String>();
	
	public void addToList() {
		colourList.add("red");
		colourList.add("blue");
		colourList.add("green");
	}
	
	// Takes in a colour, if it can find that colour in the list, return the colour
	// else return null
	public Optional<String> findColour(String colour) {
		
		// some kind of if statement 
		// how can i run an if statement on every element in the list
		// for every String IN colourList, do this code passing in colourInList 
		for(String colourInList : colourList) {
			// if this colour in the list is equal to the colour we passed in
			if(colourInList == colour) {
				// returns an Optional object containing the value colourInList
				// colourInList - variable name, red, green, blue 
				// return an Optional object which contains red, green or Blue 
				return Optional.of(colourInList); 
			}  
		}
		// returns an empty optional box
		return Optional.empty();
		
		// Optional("red") is the same data type as Optional(null) 
		
		// When we run this we either return a String colour OR we return null 
		// We want to return the same data type regardless of whether it finds it or not
		
		// Optional objects are boxes, which contain the data 
		
	}

}
