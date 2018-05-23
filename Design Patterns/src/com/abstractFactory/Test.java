package com.abstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String args[]) {
/*		String country = "India";

		AbstractFactory currencyFactory = new CurrencyFactory();

		Currency cr = currencyFactory.getCurrency(country);

		System.out.println(cr.getSymbol());

		AbstractFactory populationFactory = new PopulationFactory();

		Population pop = populationFactory.getPopulation(country);

		System.out.println(pop.getPopulation());
*/
		List<? extends Number> liNumber = new ArrayList<>();
	//	List<Number> liNumber = new ArrayList<>();
		List<Integer> liInteger = new ArrayList<>();
		List<Double> liDouble = new ArrayList<>();
		List<Object> liObject = new ArrayList<>();

		
		
		double d= 10;
	//	liNumber.add(1);
	//	liNumber.add(d);
		
		
		name(liNumber);
		name(liInteger);
		
		
		name(liDouble);
		name(liObject);
	}

	private static void name(List<?> li) {

		li.remove(0);
		//li.add(1);
		
	}
}
