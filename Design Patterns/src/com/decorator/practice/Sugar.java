package com.decorator.practice;

public class Sugar extends ExtraDecorator {

	Beverage beverage;

	public Sugar(Beverage beverage) {

		this.beverage = beverage;
	}

	@Override
	public String getDescription() {

		System.out.println("In sugar");
		
		return beverage.getDescription() + "   " + " SUgar Added";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 12;
	}

}
