package com.capgemini.java.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExam {

	public static void main(String[] args) {
		Currency currency1 = Currency.getInstance("INR");
		Currency currency2 = Currency.getInstance("USD");

		String currency1symbol = currency1.getSymbol();
		String currency2symbol = currency2.getSymbol();

		System.out.println("Symbol for INR :" + currency1symbol);
		System.out.println("Symbol for USA :" + currency2symbol);
		System.out.println("************************");
		
		String currency1display = currency1.getDisplayName();
		String currency2display = currency2.getDisplayName();
		
		System.out.println("Name for INR :"+currency1display);
		System.out.println("Name for USD :"+currency2display);
		System.out.println("***********************************");

		
		int currency1no = currency1.getNumericCode();
		int currency2no = currency2.getNumericCode();
		
		System.out.println("Numeric code for INR :"+currency1no);
		System.out.println("Numeric code for USD :"+currency2no);
		System.out.println("**************************************");
		
		Set<Currency> currencies = Currency.getAvailableCurrencies();
		System.out.println(currencies);
		System.out.println("***************************************");
		
		int currency1default = currency1.getDefaultFractionDigits();
		int currencydefault = currency2.getDefaultFractionDigits();
		
		System.out.println("Default Fraction of INR :"+currency1default);
		System.out.println("Default Fraction of USD :"+currencydefault);
		System.out.println("********************************************");
	}

}
