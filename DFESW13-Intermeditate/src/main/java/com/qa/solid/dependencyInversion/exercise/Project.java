package com.qa.solid.dependencyInversion.exercise;

import java.util.ArrayList;

public class Project {
	
	// Creating an array of Developers, backend + frontend are of type Developer
	private ArrayList<Developer> devTeam = new ArrayList<Developer>();
	
	// method to add Devs to the dev team
	public void hireStaff() {
		// adding a backend Object to our array List
		// and adding a frontend object to our array list 
		devTeam.add(new BackEnd());
		devTeam.add(new FrontEnd());
	}
	
	
	// method to run our develop methods
	public void developCode() {
		
		// for every Object of type Developer IN(:) my arrayList, do this with them
		for(Developer dev : devTeam) {
			dev.develop();
		}
		
	}

}
