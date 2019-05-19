package com.class34;
import java.util.*;
public class MarketingTest {

	public static void main(String[] args) {
	
		Map <String, Marketing> sales = new HashMap<>();
		
		sales.put("Joe", new Marketing("Joe", "Shoes", 2000.00));
		sales.put("Smith", new Marketing("Smith", "Shoes", 4000.00));
		sales.put("Adam", new Marketing("Adam", "Shoes", 4000.00));
		sales.put("Mark", new Marketing("Mark", "Shoes", 6000.00));
		sales.put("Tiffani", new Marketing("Tiffani", "Shoes", 1000.00));
		sales.put("Marry", new Marketing("Marry", "Shoes", 2000.00));
		sales.put("Sam", new Marketing("Sam", "Shoes", 10000.00));
		sales.put("Ali", new Marketing("Ali", "Shoes", 2000.00));
		sales.put("Olga", new Marketing("Olga", "Shoes", 3000.00));
		sales.put("Colin", new Marketing("Colin", "Shoes", 5000.00));
		
		for (String key:sales.keySet()) { //to access all our keys
			Marketing m= sales.get(key); // accessing our values through keys
			if (m.getSaleAmount()>3000) {
			System.out.println(m.toString());
		   }
	
		}
	}
}