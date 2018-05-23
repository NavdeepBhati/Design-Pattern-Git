package com.decorator.practice;

public class Cream extends ExtraDecorator {

	Beverage beverage;

	public Cream(Beverage beverage) {

		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		System.out.println("In cream");
		
		return beverage.getDescription() + "   " + " Cream Added";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 15;
	}
}
