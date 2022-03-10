package com.qa.testing.coinFlip;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.times;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
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

	// Regular Random object (done for example)
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
	public void actualCoinFlipTestHeads() {

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
		
		// Verify / verifiers - Check if the mocked methods have been ran, and how many times they have ran 
		// verify takes in (mocked Object, verify Paramater).methodToCheck()
		// did mockRandom call nextInt(102) once
		Mockito.verify(mockRandom, times(1)).nextInt(102); // runs once
		Mockito.verify(mockRandom).nextInt(102); // runs atall
		Mockito.verify(mockRandom, Mockito.atLeastOnce()).nextInt(102); // runs atleast once
		Mockito.verify(mockRandom, Mockito.atLeast(1)).nextInt(102); // runs atleast one time
		Mockito.verify(mockRandom, Mockito.never()).nextInt(50); // never runs
	}

	@Test
	public void coinFlipTails() {

		// Arrange
		// when mockRandom.nextInt(102) is called it returns 70 (future tense)
		// At this specific moment we are telling our object to return this number in
		// the future
		Mockito.when(mockRandom.nextInt(102)).thenReturn(70);

		CoinFlip testValue = CoinFlip.TAILS;

		// Act - Saving the return of our method as a boolean
		boolean result = coinFlipperWithMocks.flipCoin(testValue);

		// Assert
		Assertions.assertTrue(result);
	}

	@Test
	public void coinFlipEdge() {

		// Arrange
		CoinFlip testValue = CoinFlip.EDGE;
		Mockito.when(mockRandom.nextInt(102)).thenReturn(101);

		// Act
		boolean result = coinFlipperWithMocks.flipCoin(testValue);

		// Assert
		Assertions.assertTrue(result);

	}

	@Test
	public void coinFlipFalse() {

		// Arrange
		CoinFlip testValue = CoinFlip.EDGE;
		Mockito.when(mockRandom.nextInt(102)).thenReturn(20);

		// Act
		boolean result = coinFlipperWithMocks.flipCoin(testValue);

		// Assert
		Assertions.assertFalse(result);

	}

	// JUnit for our tests
	// Test my FlipCoin() it returns a true or a false
	// Our CoinFlip() is running via a random object

//	CoinFlipper coinFlipper = new CoinFlipper();

	// Mock the Random() and tell it to return a specific value
	// Create a Mock random() that we can specify what number it returns

	// Mockito - Allows us to mock objects, and specify what their methods return

	// method returns true or false
	@Test
	public void callFlipTest() {

		// Arrange
		String value = "heads";
		Mockito.when(mockRandom.nextInt(102)).thenReturn(20);

		// Act
		boolean result = coinFlipperWithMocks.callFlip(value);

		// Assert
		Assertions.assertTrue(result);

	}

}
