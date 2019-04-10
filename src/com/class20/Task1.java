package com.class20;

public class Task1 {
	
		/* Create a method createEmail(). 
		 * Based on provided users name, lastName and email type, 
		 * your method should return complete email Address;
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com */

	public static void main(String[] args) {
		Task1 obj = new Task1();
		String email = obj.createEmail("Lera", "Sviridova", "gmail");
		System.out.println(email);

		email = obj.createEmail("Bob", "Snow", "outlook");
		System.out.println(email);
	}

	String createEmail(String name, String lastName, String emailType) {
		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
	}
}
