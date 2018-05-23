package com.Factory;


public abstract class PizzaStore {

	
	protected abstract Pizza createPizza(String item);
	 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getPizzaName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	
}
