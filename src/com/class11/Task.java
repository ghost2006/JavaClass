package com.class11;

public class Task {

	public static void main(String[] args) {
//1. create an array of cars and store 6 elements in it.Using 2 diff loops,print all values from the array.

		String [] cars= {"BMW", "Honda", "Mercedes", "Volvo", "Fiat", "Bently"};
		//1.
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		//2.
		for (String car:cars) {
			System.out.println(car);
		}
//2.	Create an array of countries. While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).
		 
		String [] countries = {"USA", "Russia","Ukraine", "England", "Portugal"};
//1.		 
		 	for (int i=0; i<5; i++) {
			if (countries[i].equals("USA")) {
				System.out.println("Washington DC");
			} else if (countries[i].equals("Russia")) {
				System.out.println("Moscow");
			} else if (countries[i].equals("Ukraine")) {
				System.out.println("Kyiv");
			} else if (countries[i].equals("England")) {
					System.out.println("London");
			} else if (countries[i].equals("Portugal")) {
				System.out.println("Lisbon");
			} }
 //2. 
		 String [] countries1= {"USA", "Russia","Ukraine", "England", "Portugal"};	 
		 for (String country:countries1) {
			switch (country) {
			case "USA":
				System.out.println("Washington DC");
			break;
			case "Russia":
				System.out.println("Moscow");
			break;
			case "Ukraine":
				System.out.println("Kyiv");
			break;
			case "England":
				System.out.println("London");
			break;
			case"Portugal":
				System.out.println("Lisbon");
			break;
			}  }
		
//3. Create an array on integers and calculate the sum of all elements in an array.	
		int [] numbers= {2,4,6,8,10};
		
		int sum=0; 
		int sum1=0;
//1.		
		for (int i=0; i<5; i++) {
			sum+=numbers[i];
		}
		System.out.println(sum);
//2. 	
		for (int number:numbers) {
			sum1+=number;
		}
		System.out.println(sum1);
		
//------------------------------------------------------------------------------------------------------		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		
		int sum3=0;
		
		for (int i = 0; i <a.length; i++) {
			if (a[i] % 2== a2[i ] % 5) {  //only 11%2=1 and 11%5=1 --> on i=2 -->2*2=4
				sum3 += i * i;
		}
		}
			System.out.println("sum = " + sum3);

		
		
	}
}
