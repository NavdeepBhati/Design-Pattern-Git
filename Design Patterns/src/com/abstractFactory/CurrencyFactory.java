package com.abstractFactory;

public class CurrencyFactory extends AbstractFactory {

	      

	@Override
	public Population getPopulation(String population) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currency getCurrency(String country) {
		
		 if (country. equalsIgnoreCase ("India")){
             return new Rupee();
      }else if(country. equalsIgnoreCase ("Singapore")){
             return new SGDDollar();
      }else if(country. equalsIgnoreCase ("US")){
             return new USDollar();
       }
      throw new IllegalArgumentException("No such currency");
      }
	}

