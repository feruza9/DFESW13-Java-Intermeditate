package com.qa.testing.jdbc;

import java.sql.SQLException;

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
	
	PizzaManager manager = new PizzaManager();
	
	// Test objects to use with the tests
	Pizza pizza1 = new Pizza("test-flavour1", 1, false);
	Pizza pizza2 = new Pizza("test-flavour2", 2, false);
	
	// Test objects with id 
	Pizza pizza1ID = new Pizza(1, "test-flavour1", 1, false);
	Pizza pizza2ID = new Pizza(2, "test-flavour2", 2, false);
	
	// I want to reset my database between tests
	@BeforeEach
	@AfterEach
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
	@Test
	public void addSetPizzaTest() {
		
		// Arrange
		
		// Act
		boolean result = manager.addSetPizza();
		
		// Assert
		Assertions.assertTrue(result);
		// Adding a pizza to our production database 
	}
	
	@Test
	public void addPizzaTest() {
		
		// Arrange
		Pizza testPizza = new Pizza("new", 10, false);
		
		// Act 
		boolean result = manager.addPizza(testPizza);
		
		// Assert
		Assertions.assertTrue(result);
	}
	
	@Test
	public void getPizzaByIdTest() {
		
		// Arrange
		int id = 1;
		
		// Act
		Pizza result = manager.getPizzaById(id);
		System.out.println(result);
		
		// Assert
		// The pizza at id 1 SHOULD be the same as the first test pizza
		Assertions.assertEquals(result, pizza1ID);
	}
}
