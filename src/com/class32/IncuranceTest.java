package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IncuranceTest {

	public static void main(String[] args) {
	
		Insurance car=new Car("geico", "BMW");
		Insurance pet=new Pet("petInsurance", "cat");
		Insurance health=new Health("health insurance");
		
		ArrayList <Insurance> ar=new ArrayList<>();
		ar.add(car);
		ar.add(pet);
		ar.add(health);
		
		for (Insurance in:ar) {
			in.cancelInsurance();
			in.getQuote();
			System.out.println(in.insuranceName);
		}
		
		 for (int i=0; i<ar.size(); i++) {
			 ar.get(i).getQuote();
			 ar.get(i).cancelInsurance();
		 }
		
		Iterator <Insurance> it= ar.iterator(); // don't forget to define the type of iterator!!!!
		while(it.hasNext()) {
			it.next().cancelInsurance();
			it.next().getQuote();
		}
		
		
		
		
	}
}
