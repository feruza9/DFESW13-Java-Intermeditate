package com.qa.solid.dependencyInversion.exercise;

public class BackEnd implements Developer {
	
	@Override
	public void develop() {
		writeJava();
	}
	
	public void writeJava() {
		System.out.println("Java is such a picky language, with returns and all that");
	}

}
