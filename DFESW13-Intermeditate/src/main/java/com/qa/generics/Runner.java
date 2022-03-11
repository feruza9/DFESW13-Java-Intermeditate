package com.qa.generics;

public class Runner {
	
	public static void main(String[] args) {
		
		
		// A cage class that uses the data type Dog
		// Our cage class can use ANY data type
		Cage<Dog> kennel = new Cage<>();
		
		Cage<Lion> lionCage = new Cage<>();
		
//		Cage<String> stringCage = new Cage<>(); // Cannot be ran, because String IS NOT an Animal
		
		// kennel expecting to take in an object of type dog
//		kennel.setAnimal(new Lion(true));
		
//		lionCage.setAnimal(new Dog(false));
		
		kennel.setAnimal(new Dog(true));
		
		// Generics are used when you want something to be modular
		
		// Your pizzeria may have multiple tables, pizzas, drinks, desserts etc
		// public class Order <T> - an order has a type of data to take in
		// but it can be anything 
		// Order<drink> drinksOrders = new Order<drink>();
		
		
		// Exercise - Create a class called "Present" which uses Generics to set its variable contents 
		// private T contents
		// Create 3 classes which are 'Things' that could be in the present, socks, candles, ps5, headphones
		// From your runner create a Present class that takes in one of these data types 
	}

}
