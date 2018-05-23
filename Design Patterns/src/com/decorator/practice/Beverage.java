package com.decorator.practice;

public abstract class Beverage {

	String description = "Unknown";

	double cost;

	
	public String getDescription() {
		System.out.println("In beverage");
		
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
