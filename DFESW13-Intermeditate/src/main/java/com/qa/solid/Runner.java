package com.qa.solid;

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
		
		
	}

}
