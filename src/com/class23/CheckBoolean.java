package com.class23;

public class CheckBoolean {
	    /*Task: Create a boolean method that takes 2 boolean parameters of boolean
			(true,true) print false
			(false,true) print true
			(true,false) print false
			(false,false) print true */
	  
	static boolean flag (boolean a, boolean b) {

	        boolean c=false;
	        if(a==true&&b==true) {
	            c=false;
	        }else if(a==false&&b==true) {
	            c=true;
	        }else if(a==true&&b==false) {
	            c=false;
	        }else if(a==false&&b==false) {
	            c=true;
	        }
	        return c;
	    }

	    public static void main(String[] args) {
	        System.out.println(flag(false, false)); //static method--> can access through it's name
	    }
	}