package com.qa.solid.openClosed.greetingExercise;

// @Override - Doesn't do anything, its only purpose is to tell developers "Hey, i've updated this method" 
// @Override - only used when you are changing a method, i.e changing an abstract method 

public class Greeter {
	
	private Greeting greetType;
		
	public Greeter(Greeting greetType) {
		super();
		this.greetType = greetType;
	}

	public Greeting getGreetType() {
		return greetType;
	}

	public void setGreetType(Greeting greetType) {
		this.greetType = greetType;
	}
	
	// Uses the built in variable to dictate the greeting 
	public String builtInGreeting() {
		return getGreetType().greeting();
	}
	
	
	// Takes in a paramater to dictate the greeting
	public String  greetingParam(Greeting greeting) {
		// running the greeting() method of the greeting object (Casual or Formal)
		return greeting.greeting();
	}

}
