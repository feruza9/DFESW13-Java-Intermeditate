package com.qa.solid.dependencyInversion.weatherTracker;

public class Phone implements Notifier {

	@Override
	public void alertConditions(String conditions) {
		if(conditions.equals("rainy")) {
			System.out.println("It's Rainy!");
		}
		
	}

}
