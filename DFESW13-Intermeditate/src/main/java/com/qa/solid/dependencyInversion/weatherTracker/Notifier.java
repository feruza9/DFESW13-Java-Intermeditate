package com.qa.solid.dependencyInversion.weatherTracker;

public interface Notifier {
	
	// A method which takes in a String and calls it conditions
	public void alertConditions(String conditions);

}
