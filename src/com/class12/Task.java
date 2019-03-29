package com.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*Accept username, password and confirm password and check following requirements:
		 * Username and Password cannot be empty, if so→ message=”Username and Password cannot be empty”.
		 * Password should be minimum 8 characters, if less → message=”Password is too short”.
		 * Password cannot contain username if so, → message=”Password cannot contain username”.
		 * Password should match confirmed password, if not  → message “Passwords do not match”.
		 Only after all requirements met → message “Your username and password has been created”  */

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your username and password");
		String username= scan.nextLine();
		String password= scan.nextLine();
		
		System.out.println("Please confirm your password password");
		String confirmedpassword=scan.nextLine();
		
		boolean isEmpty = username.isEmpty();
		boolean isEmpty1=password.isEmpty();
		if (isEmpty && isEmpty1){
			System.out.println("Username and Password cannot be empty");
		} else {
			int length=password.length();
			if (length<8) {
				System.out.println("Password is too short!");
			}else {
				if(password.contains(username)) {
					System.out.println("Password can not contain username!");
				}else {
					if (!confirmedpassword.equals(password)) {
					System.out.println("Passwords do not match");
				}else {
					System.out.println("Your username and password have been created!");
				}
	
	}
	} }
//----------------2nd way--------------------------------------
		//String userName, password, confirmedPassword, message;
//		
//		scan=new Scanner(System.in);
//		System.out.println("Please enter username");
//		userName=scan.nextLine();
//		
//		System.out.println("Please enter password");
//		password=scan.nextLine();
//		
//		System.out.println("Please confirm password");
//		confirmedPassword=scan.nextLine();
//		
//		if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
//			if(password.length()>8) {//2 checkpoint
//				if (!password.contains(userName)) {//3 checkpoint
//					if (password.equals(confirmedPassword)) {//4 checkpoint
//						message="Your username and password has been created";
//					}else {
//						message="Passwords do not match";
//					}
//				}else {
//					message="Password cannot contain username";
//				}
//			}else {
//				message="Password is too short";
//			}
//		}else {
//			message="Username and Password cannot be empty";
//		}
//		System.out.println(message);
//	
//	
	
	
	
	}}
