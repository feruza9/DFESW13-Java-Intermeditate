package com.qa.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;

// Connect to the database, send queries and receieve data 
public class DBManager {
	
	// Create a bunch of variables to use 
	// final - The value can never be changed 
	// generally final variables are UPPER CASE
	
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";        // - what driver to use
	final String DB_URL = "jdbc:mysql://localhost:3306/pizzeria"; // what is the URL of the database
	
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
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			return conn;
		}
		System.out.println("Connected to Database succesfully :)");
		return conn;
		
	}

}
