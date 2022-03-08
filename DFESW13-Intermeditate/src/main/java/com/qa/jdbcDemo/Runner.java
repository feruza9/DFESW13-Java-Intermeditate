package com.qa.jdbcDemo;

import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		
		ArrayList<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(new Pizza("Veggie Hot", 10, false));
		pizzaList.add(new Pizza("Pepperoni", 8, true));
		
		DBManager db = new DBManager();
//		db.connectDB();
		PizzaManager manager = new PizzaManager();
		manager.addSetPizza();
		manager.addPizza(new Pizza("BBQ Chicken", 10, true));
		manager.addPizza(new Pizza("Ham and Pineapple", 12, false));
		
		for(Pizza pizza : pizzaList) {
			manager.addPizza(pizza);
		}
		
	}

}
