package com.class6;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	
	/* Write  a program that prints out if good weather to go for any activity or not.
	 * IF the temp is between 40 and 80 degrees & no raining --> we will go for hiking, unless it's raining--> we won't hiking.
	 * IF temp is between 25 and 40 degrees inclusive snowing--> going snowboarding, otherwise we are not snowboarding.
	 * IF the temp is more than 80 and sunny--> go to the beach, otherwise --> not going to the beach. */
	
	/* if temp (>=40 <=80){
	 * if (raining){
	 *activity= watch movie;
	 * } else {
	 * activity=go hiking;
	 * }else if (temp >=25 <40){
	 * if (snowing){
	 * activity=snowboarding
	 * } else {
	 *activity= do coding
	 * } else if (temp>80){
	 * if (sunny){
	 * activity=go to the beach;
	 * }else {
	 * activity=more coding; 
	 * } else {
	 * System.out.println("Please enter different temperature");
	 * activity=unknown;*/
	
	Scanner scan; 
	boolean snow,rain,sunny;  //----> our local variables (we use them inside of our code)
	int temp;
	String activity;
	scan= new Scanner(System.in);
	
	System.out.println("Please enter a temperature");
	temp=scan.nextInt();
	if (temp>= 40 && temp<80) {
		System.out.println("Please enter if it's rainig?");
		rain=scan.nextBoolean();
		if (rain) {
			activity= "Watch movie";
		}else {
			activity= "Go hiking";
		}
	}else if (temp>=25 && temp<40) {
		System.out.println("Is it's snowing?");
		snow=scan.nextBoolean();
		if (snow) {
			activity= "Go Snowboarding";
		} else {
			activity="Code";
		}
	} else if (temp>=80) {
		System.out.println("Please enter if it's sunny weather?");
		sunny=scan.nextBoolean();
		if (sunny) {
			activity= "Go to the beach";
		}else {
			activity= "Do more coding";
		}
	} else {
		System.out.println("Please enter different temp");
			activity= "Unknown";//!!! every time we should assign for each block of the code the ACTIVITY! (should assign local variable)
}
	System.out.println("Today you will "+activity);
}
}
