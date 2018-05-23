package com.factoryCurrency;

public class CurrencyTest {

	public static void main(String args[]) {
        String country = "India";
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
 }
}
