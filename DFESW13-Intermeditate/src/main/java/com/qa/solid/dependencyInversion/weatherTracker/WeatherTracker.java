package com.qa.solid.dependencyInversion.weatherTracker;

public class WeatherTracker {
	
	private String conditions;

	// Constructor for our weather tracker
	public WeatherTracker(String conditions) {
		super();
		this.conditions = conditions;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	
	// Method to notify which takes in an object of type Notifier
	public void notify(Notifier notifier) {
		
		// Its running the specified notifier (phone or email)
		// running the alertConditions() passing in the weather conditions of this object
		notifier.alertConditions(conditions);
	}
	
	
	
	

}
