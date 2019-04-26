package com.class27;

public class User {
	
	public String name; //public giving the accessibility to our variables
	long mobNum;
	
	public User(String name, long mobNum){ // to initialize our instance variables
		this.name=name;
		this.mobNum=mobNum;
	}
}

class UserInfo extends User{ 
	public String adress;
	
	UserInfo(String name, long mobNum, String adress){ //we have explicitly specify the constructor with parameters!compiler dosn't do it for us!
		super(name,mobNum);
		this.adress=adress;
	}
	
	public void userDetails() {
	                       //!!! we are not using here 'Super.' cause we don't have the same name variables in Child -Parent classes
		System.out.println("Tha name is "+name+" her mobnumber is "+mobNum+" and her adress is "+adress);
	}
}