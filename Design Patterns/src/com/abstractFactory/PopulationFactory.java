package com.abstractFactory;

public class PopulationFactory extends AbstractFactory {

	@Override
	public Population getPopulation(String country) {

		if (country.equalsIgnoreCase("India")) {
			return new India();
		} else if (country.equalsIgnoreCase("Singapore")) {
			return new Singapore();
		} else if (country.equalsIgnoreCase("US")) {
			return new USA();
		}
		throw new IllegalArgumentException("No such currency");
	}

	

	@Override
	public Currency getCurrency(String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
