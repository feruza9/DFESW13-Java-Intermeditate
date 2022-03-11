package com.qa.testing.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.jdbcDemo.Pizza;
import com.qa.jdbcDemo.PizzaManager;

public class PizzaManagerTest {
	
	// When testing an actual app, go for simple first 
	// Testing simple methods often covers the more complex ones with coverage
	
	// Creating an object of the class we want to test 
	PizzaManager manager = new PizzaManager();
	
	// Test objects to use with the tests
	// Used to put data in the database (we dont know ids when we put data in)
	Pizza pizza1 = new Pizza("test-flavour1", 1, false);
	Pizza pizza2 = new Pizza("test-flavour2", 2, false);
	
	// Test objects with id
	// Test the data coming out of the database (mySQL adds ids for us) 
	// Used for comparison with data coming out of the database
	Pizza pizza1ID = new Pizza(1, "test-flavour1", 1, false);
	Pizza pizza2ID = new Pizza(2, "test-flavour2", 2, false);
	
	
	// I want to reset my database between tests
	// This runs BEFORE every test
	@BeforeEach
	public void setup() {
		// delete all data and reset ids to 0 
		// add some fake data to work with 
		try {
			// removing all data from the table pizzas
			manager.databaseSetup().executeUpdate("TRUNCATE pizzas;");
			// adding some dummy data between tests for get requests
			manager.addPizza(pizza1);
			manager.addPizza(pizza2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// testing addSetPizza 
	// If the user can't put any different values into this test.. it will always work or won't work 
	@Test
	public void addSetPizzaTest() {
		
		// Arrange
		
		// Act
		boolean result = manager.addSetPizza();
		
		// Assert
		Assertions.assertTrue(result);
		// Adding a pizza to our production database 
	}
	
	// this method takes in an object of type Pizza
	@Test
	public void addPizzaTest() {
		
		// Arrange - Creating the object we need to pass in
		Pizza testPizza = new Pizza("new", 10, false);
		
		// Act - Passing in the object into the method 
		// if it returns true, the method is successful
		boolean result = manager.addPizza(testPizza);
		
		// Assert
		Assertions.assertTrue(result);
	}
	
	// Testing the catch block of our AddPizza - return false
	@Test
	public void addPizzaCatchTest() {
		
		// Arrange - Create a Pizza object that will cause the test to fail
		Pizza failObject = new Pizza("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, false);
		
		// Act - pass in the object that 'should' make the sql fail
		boolean result = manager.addPizza(failObject);
		
		// Assert - Checking if the result is false (because an exception has been thrown) 
		Assertions.assertFalse(result);
		
		
	}
	
	@Test
	public void getPizzaByIdTest() {
		
		// Arrange
		int id = 1;
		
		// Act
		Pizza result = manager.getPizzaById(id); // Saving the Pizza as object result at id 1 (in the database)
		System.out.println(result);
		
		// Assert
		// The pizza at id 1 SHOULD be the same as the first test pizza
		Assertions.assertEquals(result, pizza1ID);
	}
	
	@Test
	public void getPizzaByIdCatch() {
		
		// Arrange - anything but 1 or 2
		int id = 400;
		
		// Act - result 'should' be equal to null
		Pizza result = manager.getPizzaById(id);
		System.out.println("catch test result:" + result);
		
		// Arrange
		
		Assertions.assertNull(result);
		
	}
	
	@Test
	public void getAllPizzasTest() {
		
		// Arrange - Creating an arrayList of the data we're returning from the database
		ArrayList<Pizza> expected = new ArrayList<>();
		expected.add(pizza1ID);
		expected.add(pizza2ID);
		System.out.println("expected");
		System.out.println(expected);
		System.out.println(" ");
		
		// Act - saving the return of our getAllPizzas()
		ArrayList<Pizza> result = manager.getAllPizzas();
		System.out.println("result");
		System.out.println(result);
		
		// Assert
		Assertions.assertEquals(expected, result);
		
	}
}
