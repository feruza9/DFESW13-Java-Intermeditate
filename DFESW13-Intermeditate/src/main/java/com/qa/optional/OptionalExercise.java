package com.qa.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExercise {
	
	// Creates a list of Strings, and it initialises the list with these values
	private List<String> fruitList = List.of("strawberry", "kiwi", "grapes");
	
	public Optional<String> findFruit(String query){
		
		for(String fruit : fruitList) {
			
			if(fruit == query) {
				return Optional.of(fruit);
			}
			
		}
		return Optional.empty();
		
	}
	
	public String convertOptionalString(String query) {
		
		// Return an Optional from the findFruit method
		// Save that as a variable called foundOptional
		Optional<String> foundOptional = findFruit(query);
		
		// returns the value of the optional (kiwi, grapes etc) 
		// if the optional is empty returns "not a fruit"
		return foundOptional.orElse("not a fruit");
		
	}

}
