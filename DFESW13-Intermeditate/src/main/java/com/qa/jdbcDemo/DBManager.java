package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// Connect to the database, send queries and receieve data 
public class DBManager {
	
	// Create a bunch of variables to use 
	// final - The value can never be changed 
	// generally final variables are UPPER CASE
	
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";        // - what driver to use
								// 3306 port number of mysql
	final String DB_URL = "jdbc:mysql://localhost:3306/testPizzeria"; // what is the URL of the database
	
	// If this is pushed to github (publicly) EVERYONE HAS ACCESS TO MY MySQL PASSWORD 
	// Github Scrapers (bots people have made) know that my email reece.elder@qa.com is connected to password root 
	final String USER = "root";
	final String PASSWORD = "root"; // push this to github
	
	// Connection is an object we've imported in
	// imported with java.sql.Connection;
	Connection conn;
	
	
	// Create a method to connect to your database
	// Method which returns a Connection object
	public Connection connectDB() {
		try {
			Class.forName(JDBC_DRIVER); // driver used to let two programs talk to eachother
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD); // conn = to everything we need to connect
		} catch (Exception e) {
			e.printStackTrace();
			return conn;
		}
		System.out.println("Connected to Database succesfully :)");
		return conn; // returns our connection method, with all the connection info we need 
		
	}
	
	
	// method to convert ResultSet to pizza objects
	public Pizza convertResults(ResultSet result) {
		
		// We need to deconstruct the resultset (excel spreadsheet)
		// into the variables for an object of type pizza
		try {
			// Finding the value for column pizza_id
			// saving this value as an int called id
			long id = result.getLong("pizza_id"); 
			
			String flavour = result.getString("flavour");
			int slices = result.getInt("slices");
			boolean stuffedCrust = result.getBoolean("stuffed_crust");
			
			// Create a pizza object out of this values
			Pizza pizza = new Pizza(id, flavour, slices, stuffedCrust);
			return pizza;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null; // if there is an error return null
		}
		
	}

}
