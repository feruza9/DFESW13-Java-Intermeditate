package com.qa.generics;

public class Lion extends Animal {
	
	private boolean eatenSteak;

	public Lion(boolean eatenSteak) {
		super();
		this.eatenSteak = eatenSteak;
	}

	public boolean isEatenSteak() {
		return eatenSteak;
	}

	public void setEatenSteak(boolean eatenSteak) {
		this.eatenSteak = eatenSteak;
	}
}
