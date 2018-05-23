package com.Factory;

public class Pizza {

	String pizzaName;

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public void prepare() {
		System.out.println("Pizza prepare");
	}

	public void bake() {
		System.out.println("Pizza bake");

	}

	public void cut() {
		System.out.println("Pizza cut");

	}

	public void box() {
		System.out.println("Pizza box");

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
