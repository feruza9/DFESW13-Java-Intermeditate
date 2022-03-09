package com.qa.solid.dependencyInversion.weatherTracker;

public class Email implements Notifier {

	@Override
	public void alertConditions(String conditions) {
		if(conditions.equals("sunny")) {
			System.out.println("It's Sunny!");
		}
		
	}

}
