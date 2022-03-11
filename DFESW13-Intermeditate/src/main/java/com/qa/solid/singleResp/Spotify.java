package com.qa.solid.singleResp;

public class Spotify {
	
	// This method takes in the Person object, and takes in a String for song
	public void listenMusic(Person person, String song) {
		
		System.out.println(person.getName() + " is listening to " + song);
	}

}
