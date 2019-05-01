package com.class29;

/*Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
* After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
*Valid email consider to be only gmail
*Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.*/

public class Registration { //2d way we can check in RegistrationClass
	   private String email, userName, password;

	    public String getPassword() { // to do it automatically --> go under source--> generate Getters & setters
	        return password;
	    }

	    public void setPassword(String password) {
	        if(!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
	            this.password = password;
	        } else {
	            System.out.println("Not valid password");
	        }
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        //Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
	        if(!userName.isEmpty() && userName.length() > 6) {
	            this.userName = userName;
	        } else {
	            System.out.println("Not vailid user name");
	        }
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        //Valid email consider to be only gmail
	        if(email.contains("gmail")) {
	            this.email = email;
	        }
	        else {
	            System.out.println("Please provide only gmail");
	        }   
	    }
	    

}
