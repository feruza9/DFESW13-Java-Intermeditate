package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// Object manager - contains methods to achieve CRUD functionality 
public class PizzaManager {
	
	// Creating my DBManager object for use in the code
	DBManager manager = new DBManager();
	
	// this method returns an empty query statement
	// by setting the query in this object we can send MySQL queries
	public Statement databaseSetup() {
		Statement statement = null;
		try {
			Connection conn = manager.connectDB();
			
			// Statement is an object, which includes the MySQL query to make
			// Setup an empty statement object, so we can eventually add the query
			statement = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return statement;
	}
	
	public boolean addSetPizza() {
		try {
			// the MySQL Query we send to the database to add some data
			String query = "INSERT INTO pizzas (flavour, slices, stuffed_crust) VALUES (\"Pepperoni\", 12, true);";
			// what does databaseSetup() return - statement object
			// statement.executeUpdate(String query)
			databaseSetup().executeUpdate(query); // Puts our query into the statement object, and runs the query
			return true; 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		// if there is no issue, returns true
		// if there is an exception returns false
		
	}
	
	// Generally if you don't need data back, methods should return a boolean 
	// - Testing, sanity testing (we don't wanna see false)
	// If the method is requesting data (get request) it should return that data
	
	
	// addPizza will take in a pizza object
	public boolean addPizza(Pizza pizza) {
		// use our getters and setters
//		System.out.println(pizza.getFlavour());
		try {
			String query = "INSERT INTO pizzas (flavour, slices, stuffed_crust) VALUES (\"" + pizza.getFlavour() + "\", " + pizza.getSlices() + ", " + pizza.isStuffedCrust() + ");";
			databaseSetup().executeUpdate(query);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean addPizzaLoop() {
		try {
			ArrayList<Pizza> pizzaList = new ArrayList<>();
			pizzaList.add(new Pizza("Veggie Hot", 10, false));
			pizzaList.add(new Pizza("Pepperoni", 8, true));
			
			// for each object of type pizza in my pizzalist
			for(Pizza pizza : pizzaList) {
				addPizza(pizza);
			}
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// A method to request ALL data from the database
	public boolean getAllPizzas() {
		try {
			String query = "SELECT * FROM pizzas";
			// we're saving the return of our executeQuery 
			// it returns the data we need for our method to work
			ResultSet result = databaseSetup().executeQuery(query); // returns a ResultSet object
			// make a method to convert Results -> Pizza objects
			
			// if this is true, there is one more record of data below
			// if returns false, there is no more data 
			// while loop - easy for true and false, and not knowing when it finishes
			while(result.next()) {
				// pass in the current value of result (has moved down a line) 
				// convert method converts it to a pizza
				Pizza newPizza = manager.convertResults(result); 
				System.out.println(newPizza);
			}
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// Will return all pizzas where they have stuffed crust = true
	public boolean getAllStuffedCrust() {
		try {
			// MySQL true = 1
			String query = "SELECT * FROM pizzas WHERE stuffed_crust = true";
			ResultSet result = databaseSetup().executeQuery(query);
			
			// while there is another row of data below the current
			// move down the row and use the new data
			while(result.next()) {
				System.out.println(manager.convertResults(result));
			}
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// Get all method that takes in a query
	public boolean getAllQuery(String query) {
		try {
			// MySQL true = 1
			ResultSet result = databaseSetup().executeQuery(query);
			
			// while there is another row of data below the current
			// move down the row and use the new data
			System.out.println(" ");
			System.out.println(query);
			while(result.next()) {
				System.out.println(manager.convertResults(result));
			}
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
