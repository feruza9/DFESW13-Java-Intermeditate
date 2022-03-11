package com.qa.optional;

import java.util.Optional;

public class OptionalDemo {
	
	// our method now returns an Optional<String>
	public Optional<String> optionalPractice() {
		
		// this String is null as it has no value
		String nullString = null;
		
		System.out.println(nullString);
		
		return Optional.of(nullString);
		
		// You can't do this as the variable has not been initialised == it is null
//		System.out.println(nullString);
		
//		Optional<String> newOptional = Optional.of(nullString);
		
	}

}
