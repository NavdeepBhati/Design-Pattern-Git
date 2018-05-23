package com.Factory;

public class PizzaTest {

	
	public static void main(String[] args) {
		
		PizzaStore ps= new NYPizzaStore();
		
		ps.orderPizza("Margherita");
		
		System.out.println("Pizza Done");
		
		
	}
}
