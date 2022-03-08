package com.qa.generics;

public class Dog extends Animal {
	
	private boolean goodBoy;

	public Dog(boolean goodBoy) {
		super();
		this.goodBoy = goodBoy;
	}

	public boolean isGoodBoy() {
		return goodBoy;
	}

	public void setGoodBoy(boolean goodBoy) {
		this.goodBoy = goodBoy;
	}
	
}
