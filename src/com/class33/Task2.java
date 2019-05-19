package com.class33;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		/*Create a map of countries with its capital. 
		 * Print all keys and values from a country map using for each loop and iterator.
		 * Print all values from a country map using for each loop and iterator.*/

		Map <String, String> countries=new LinkedHashMap<>();
		countries.put("Ukraine", "Kyiv");
		countries.put("Russia", "Moscow");
		countries.put("USA", "Washington");
		countries.put("Canada", "Ottawa");
		
		//Getting all keys
		Set <String> countriesSEt=countries.keySet(); //keySet() method--> will return the SET of keys from the map!
		
		System.out.println("---USING Advanced Lopp---");
		for (String country: countriesSEt) {
			System.out.println(country+ ":"+ countries.get(country));
		}
		System.out.println("---USING ITERATOR---");
		Iterator<String> countriesIt=countriesSEt.iterator();
		while(countriesIt.hasNext()) {
			String country= countriesIt.next();
			System.out.println(country+ ":"+ countries.get(country));
		}
		
		//Getting all values
		Collection<String>capitals=countries.values(); //values() method --> returns Collection of values from a map!!!
		
		System.out.println("---USING Advanced Lopp---");
		for (String capital:capitals) {
			System.out.println("The capital is: "+capital);
		}
		System.out.println("---USING ITERATOR---");
		Iterator<String> capitalsIt=capitals.iterator();
		while(capitalsIt.hasNext()) {
			System.out.println(capitalsIt.next());
		}
	}

}
