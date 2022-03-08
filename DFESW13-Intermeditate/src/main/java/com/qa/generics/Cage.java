package com.qa.generics;

import java.util.ArrayList;

/* Generics are used to aid abstraction, and add an extra layer of reliability and flexibility 
  They are used to stipulate a type of object for something, but you can stipulate a group of objects
 */

public class Cage<T> {
	
	// Generics are created by using <>
	// ArrayLists<Strings> stringList = new ArrayList<>();
	// This ArrayList can only contain types of Strings 
	// The data type we can use with ArrayLists has to be a generic, placeholder 
	
	public ArrayList<String> stringList = new ArrayList<>();
	 
	// Requires me to create an extra class and make Dog and Lion inherit
//	private Animal animal;
	
	// At the moment, we dont know what type of animal
	// Will be initialised when we create the cage
	private T animal;

	// Returns an object of type T
	public T getAnimal() {
		return animal;
	}

	// Takes in an object of type T
	public void setAnimal(T animal) {
		this.animal = animal;
	}
	
	

}
