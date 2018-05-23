package com.Factory;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {

		if(item.equals("Margherita")) {
			
			return new MarghertiaPizza("Margherita   Pizza");
		}
		
		return null;
	}

}
