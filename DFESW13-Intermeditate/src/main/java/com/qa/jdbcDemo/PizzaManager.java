package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// Object manager - contains methods to achieve CRUD functionality 
public class PizzaManager {
	
	// Creating my DBManager object for use in the code
	DBManager manager = new DBManager();
	
	// Making our connection object a global variable
	Connection conn = manager.connectDB();
	
	// this method returns an empty query statement
	// by setting the query in this object we can send MySQL queries
	public Statement databaseSetup() {
		Statement statement = null;
		try {			
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
	
	// Prepared statements - are written a little differently, a little more complicated in setup
	// main benefit is we can pass in values directly into a query without using " + getSlices() + ", 
	
	public boolean deletePizza(long id) {
		try {
			// ? is a stand in for our id variable we will set
			String query = "DELETE FROM pizzas WHERE pizza_id = ?"; 
			PreparedStatement preState = conn.prepareStatement(query);
			
			// Find the 1st ?, replace it with the value id
//			preState.set(1, "DELETE");
//			preState.setString(2, "pizzas");
//			preState.setString(3, "pizza_id");
			preState.setLong(1, id);
			
			// We don't need to put in a string to tell it what to do, as preState is the object with that string
			// telling our statement to run
			preState.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// Same as our addPizza method BUT using a prepared statement
	public boolean addPizzaPrepState(Pizza pizza) {
		try {
			
			String query = "INSERT INTO pizzas (flavour, slices, stuffed_crust) VALUES (?, ?, ?);"; 
			PreparedStatement preState = conn.prepareStatement(query);
			
			// the first ? = "pepperoni"
			preState.setString(1, pizza.getFlavour());
			preState.setInt(2, pizza.getSlices());
			preState.setBoolean(3, pizza.isStuffedCrust());
			
			// Tell our pre statement to run
			preState.executeUpdate();
			
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	// Implementing an update object method
	// Update requires finding an object (by id) 
	// passing in new data to replace that object 
	
	public boolean updatePizza(int id, Pizza pizza) {
		try {
			// update all pizzas and set flavour to be x, slices to be y etc. 
			// Only update pizzas where pizza_id = i
			String query = "UPDATE pizzas SET flavour = ?, slices = ?, stuffed_crust = ? WHERE pizza_id = ?";
			PreparedStatement preStmt = conn.prepareStatement(query);
			
			preStmt.setString(1, pizza.getFlavour());
			preStmt.setInt(2, pizza.getSlices());
			preStmt.setBoolean(3, pizza.isStuffedCrust());
			preStmt.setInt(4, id);
			
			preStmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
