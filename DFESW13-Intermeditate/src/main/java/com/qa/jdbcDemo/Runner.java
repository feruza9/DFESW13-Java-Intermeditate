package com.qa.jdbcDemo;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		

		
		DBManager db = new DBManager();
//		db.connectDB();
		PizzaManager manager = new PizzaManager();
//		manager.addSetPizza();
//		manager.addPizza(new Pizza("BBQ Chicken", 10, true));
//		manager.addPizza(new Pizza("Ham and Pineapple", 12, false));
		manager.getAllPizzas();
		manager.getAllStuffedCrust();
		manager.getAllQuery("SELECT * FROM pizzas WHERE slices > 10");
		manager.deletePizza(10); // this pizza doesn't exist 
		manager.addPizzaPrepState(new Pizza("four seasons", 32, true));
		manager.updatePizza(8, new Pizza("new flavour", 123, true));
	}

}
