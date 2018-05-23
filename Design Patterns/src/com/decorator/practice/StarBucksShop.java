package com.decorator.practice;

public class StarBucksShop {

	public static void main(String[] args) {
		
		Beverage expresso = new Expresso();
		Beverage	expressosugar = new Sugar(expresso);
		Beverage expressoCream = new Cream(expressosugar);
		
		System.out.println(expressoCream.getCost()+"    "+expressoCream.getDescription());
		
		System.out.println(expresso.getCost()+"    "+expresso.getDescription());
		
		
	}
}
