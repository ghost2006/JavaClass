package com.class29;

public class RegistrationTest {
	
	/* After creating an object of the class user should be able to call methods and in each method separately pass values
	* to set users email, userName and password. */

	    public static void main(String[] args) {
	    	
	        Registration obj = new Registration();
	       
	        obj.setUserName(" ");
	        obj.setPassword(" ");
	        obj.setEmail("abc@yahoo.com");
	        
	        System.out.println("username is " + obj.getUserName() + " and password is " + obj.getPassword() + " and email is "+ obj.getEmail());
	        
	        Registration user = new Registration();
	        user.setUserName("Anna-Maria");
	        user.setPassword("hfuiwoivn");
	        user.setEmail("ads.gmail.com");
	        System.out.println("username is " + user.getUserName() + " and password is " + user.getPassword() + " and email is "+ user.getEmail());
	        
	    }
	}

