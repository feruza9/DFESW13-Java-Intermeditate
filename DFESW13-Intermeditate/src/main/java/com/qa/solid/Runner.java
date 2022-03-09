package com.qa.solid;

import com.qa.solid.lizkov.FlyingBird;
import com.qa.solid.lizkov.Owl;
import com.qa.solid.openClosed.Barista;
import com.qa.solid.openClosed.ChaiLatte;
import com.qa.solid.openClosed.MilkShake;
import com.qa.solid.openClosed.Mocha;
import com.qa.solid.singleResp.Car;
import com.qa.solid.singleResp.Driver;
import com.qa.solid.singleResp.Mechanic;
import com.qa.solid.singleResp.Person;
import com.qa.solid.singleResp.Spotify;

public class Runner {
	
	public static void main(String[] args) {
		
		// Single Responisbility
		// Creating my person
		Person randomPerson = new Person("Leonard", "jazz", 32);
		
		// Create Spotify Object - doesnt take in any paramaters
		Spotify spotifyApp = new Spotify();
		
		// Spotify app is changing or using the person class
		// but the functionality has been split between multiple classes
		spotifyApp.listenMusic(randomPerson, "jazz track number 6");
		
		// Exercise in Community 
		// Create a Car class with Constructors, getters and setters etc
		// Create a Driver class with constructor, getters and setters
		// Driver class has a method drive(Car, distance)
		// Create these two as objects in your runner, make the drive method work 
		
		Car car = new Car(4, "blue", 12000);
		Car car2 = new Car(3, "red", 900000);
		Driver driver = new Driver("Lewis Hamilton");
		Mechanic mechanic = new Mechanic("Spent SparkPlugs Garage");
		
		mechanic.fixVehicle(car2, driver);
		mechanic.fixVehicle(new Car(6, "gold", 20), driver);
		
		// Open Closed 
		// Create my Barista object
		Barista barista = new Barista();
		
		barista.serveDrink(new ChaiLatte());
		barista.serveDrink(new Mocha());
		barista.serveDrink(new MilkShake());
		barista.serveDessert(new MilkShake());
		
		// Lizkov Principle
		learnToFly(new Owl());
		
		
	}
	
	public static void learnToFly(FlyingBird bird) {
		System.out.println(bird.fly());
	}

}
