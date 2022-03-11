package com.qa.coinFlip;

import java.util.Random;

// Will be responsible for flipping a coin and checking the value 
public class CoinFlipper {
	
	
	// make a method to flip the coin and return a result
	// do this via the random object
	
	// our random number generator as an object
	Random rng = new Random();
	
	public boolean flipCoin(CoinFlip bet) {
		
		// our enum CoinFlip is being saves as a variable called valueOfCoin
		// its current value = null 
		CoinFlip valueOfCoin = null;
		
		// generates a number between 0 - 101 and saves it as a variable number 
		// The possible numbers are exclusive, and don't include the max num
		int number = rng.nextInt(102);
		System.out.println("random number " + number);
		
		if(number <= 50) {
			// if referring to an enum value, enumName.value
			valueOfCoin = CoinFlip.HEADS;
			System.out.println("result: heads");
		} else if (number <= 100) {
			valueOfCoin = CoinFlip.TAILS;
			System.out.println("result: tails");
		} else {
			valueOfCoin = CoinFlip.EDGE;
			System.out.println("result: edge");
		}
		
		// return if valueOfCoin is equal to call
		return valueOfCoin == bet;
		// What outcome haven't I tested here? 
		
		
		// At the minute we can return 
		// heads, tails or edge 
		// only return true or false 
		
	}
	
	// method takes in a String called call
	public boolean callFlip(String call) {
		
		// Create a new object of CoinFlip and call it bet
		// bet = one of the CoinFlip Enums, the enum is chosen based on valueOf
		// valueOf() takes in a string, converts it to HEADS, TAILS, EDGE 
		CoinFlip bet = CoinFlip.valueOf(call.toUpperCase());
		// if we dont put in heads, tails or edge it is equal to null 
		System.out.println("Bet: " + bet);
		
		return flipCoin(bet);
	}
}
