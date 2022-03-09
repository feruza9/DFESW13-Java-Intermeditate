package com.qa.solid.dependencyInversion.exercise;

public class FrontEnd implements Developer {

	@Override
	public void develop() {
		writeJavaScript();
	}
	
	public void writeJavaScript() {
		System.out.println("Man, I wish I was writing in JavaScript now.. ");
	}

}
