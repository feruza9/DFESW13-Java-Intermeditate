package com.qa.jdbcDemo;

public class Runner {
	
	public static void main(String[] args) {
		
		DBManager db = new DBManager();
//		db.connectDB();
		PizzaManager manager = new PizzaManager();
		manager.addSetPizza();
		manager.addPizza(new Pizza("BBQ Chicken", 10, true));
		manager.addPizza(new Pizza("Ham and Pineapple", 12, false));
		
	}

}
