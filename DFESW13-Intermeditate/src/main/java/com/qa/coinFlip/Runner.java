package com.qa.coinFlip;

public class Runner {
	
	public static void main(String[] args) {
		CoinFlipper coinFlipper = new CoinFlipper();
		
//		coinFlipper.flipCoin();
		
		// Can't do that because "five" isnt part of the enum
//		coinFlipper.callFlip("five");
		System.out.println(coinFlipper.callFlip("lemon"));
	}

}
