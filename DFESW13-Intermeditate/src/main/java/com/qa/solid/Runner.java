package com.qa.solid;

import com.qa.solid.dependencyInversion.Pizza;
import com.qa.solid.dependencyInversion.PizzaOld;
import com.qa.solid.dependencyInversion.PizzaOrder;
import com.qa.solid.dependencyInversion.PizzaOven;
import com.qa.solid.dependencyInversion.PizzaOvenOld;
import com.qa.solid.dependencyInversion.exercise.Project;
import com.qa.solid.dependencyInversion.weatherTracker.Email;
import com.qa.solid.dependencyInversion.weatherTracker.Phone;
import com.qa.solid.dependencyInversion.weatherTracker.WeatherTracker;
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
		
		// Dependency Inversion
		// Top level classes (Parent, higher up(PizzaOven)) shouldn't depend directly on lower level classes (Pizza) 
		// Not as reliable classes restricting themselves to actual objects 
		// Pizza is constructed AND is used to transfer data 
		
		// Dependency Inversion - uses an interface to bridge the gap between parent and child class 
//		PizzaOvenOld oven = new PizzaOvenOld();
//		oven.cookPizza(new PizzaOld("Pepperoni", 10, true));
//		
//		Pizza pizza1 = new Pizza("hawiian", 10, false);
////		System.out.println(pizza1.prepPizza(new PizzaOrder));
//		PizzaOven oven2 = new PizzaOven();
//		System.out.println(oven2.cookPizza(pizza1));
		System.out.println("               ");
		Project newProject = new Project();
		newProject.hireStaff();
		newProject.developCode();
		
		System.out.println("   ");
		WeatherTracker track = new WeatherTracker("sunny");
		track.notify(new Email());
		track.notify(new Phone());
		
		
	}
	
	public static void learnToFly(FlyingBird bird) {
		System.out.println(bird.fly());
	}

}
