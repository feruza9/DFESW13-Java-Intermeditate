package com.qa.testing.coinFlip;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.coinFlip.CoinFlip;
import com.qa.coinFlip.CoinFlipper;

// Add an annotation to our class, telling it we're using Mockito
@ExtendWith(MockitoExtension.class)
public class CoinFlipperTest {
	
	// Tell our Test Class what object we wish to Mock 
	// (make a fake object, we can specify what it returns) 
	
	@Mock 
	Random mockRandom;
	
	// Regular Random object
	Random random = new Random();
	
	// Create the class we're testing, and specify to put this mock object in it
	// Takes our Mock objects and puts them in this object
	@InjectMocks
	CoinFlipper coinFlipperWithMocks;
	
//	@Test
	public void mockitoDemo() {
		System.out.println(random.nextInt(10)); // prints out random number 0-9
		
		// When the mockRandom.nextInt(10) method is called it WILL return 123
		Mockito.when(mockRandom.nextInt(10)).thenReturn(123);
		
		// This will ALWAYS print out 123
		System.out.println(mockRandom.nextInt(10));
	}
	
	@Test
	public void actualCoinFlipTest() {
		
		// Arrange - Sorting the Mockito.when out
		// Our test should ALWAYS return 30 
		Mockito.when(mockRandom.nextInt(102)).thenReturn(30);
		
		CoinFlip testValue = CoinFlip.HEADS;
		
		// Act 
		// Using the test object WITH MOCKS, run flipCoin()
		// flipCoin() runs nextInt(102) = 30
		boolean result = coinFlipperWithMocks.flipCoin(testValue);
		
		// Assert
		// Asserting if the value is true
		Assertions.assertTrue(result);
		
	}
	
	// JUnit for our tests
	// Test my FlipCoin() it returns a true or a false 
	// Our CoinFlip() is running via a random object
	
	CoinFlipper coinFlipper = new CoinFlipper();
	
	// Mock the Random() and tell it to return a specific value 
	// Create a Mock random() that we can specify what number it returns 
	
	// Mockito - Allows us to mock objects, and specify what their methods return
	
	
	
//	@Test
	public void coinFlipTest() {
		// Arrange
		// 50% < chance of passing, as the number MAY be heads
		CoinFlip testValue = CoinFlip.HEADS;
		
		// Act
		boolean result = coinFlipper.flipCoin(testValue);
		
		// Assert
		Assertions.assertTrue(result);
	}

}
