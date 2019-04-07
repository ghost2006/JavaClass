package com.pack1;

public class MainClass {
	
		  public static void main(String[] args){ //static is a modifier
		      X x = new X();  // x is a local variable
		      
		      X y=new X();
		      
		      System.out.println(x.i);
		      y.i=200; //y equals to 200
		      
		      System.out.println(y.i);

		      x.methodOfX();
		  }
		}


