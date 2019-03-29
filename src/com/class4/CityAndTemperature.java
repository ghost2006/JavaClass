package com.class4;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// ask user to enter city and temperature in fahrenheit
		//your program should convert F-->C
		// your program should say "The temp in the city___ is ___"

		String cityName; //declaring variable names
		int temp;
		
		Scanner myScanner=new Scanner (System.in);
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine(); //capture the input from console
		
		System.out.println("Please enter the temperature in F");
		
		temp=myScanner.nextInt(); //taking a second input from the user
		
		System.out.println("City name and temperature");
		
		//formula (F-32)*5/9
		
		int convertedTemp = (temp-32)*5/9;
		System.out.println(convertedTemp);
		
		System.out.println("The temperature in the city "+cityName+ " is "+convertedTemp + "C");
		
	}

}
