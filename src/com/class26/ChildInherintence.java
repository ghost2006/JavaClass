package com.class26;

public class ChildInherintence extends MainInheritance {

	 public void swapNumbers(int a, int b) {
	        System.out.println(a);
	        System.out.println(b);
	    }

	    public void swapStrings(String a, String b) {
	        System.out.println(a + " " + b);
	    }
	
	//-----above is from child-------------
	    void parentNumbers(int a, int b) {// giving our parameters and than calling parent class method
	        super.swapNumbers(a, b);
	    }

	    void parentString(String a, String b) {
	        super.swapStrings(a, b);
	    }

	    public static void main(String[] args) {
	        ChildInherintence child=new ChildInherintence();
	        child.swapNumbers(2,3);
	        child.swapStrings("nyjk", "jiufiu");//it's not swapping, just printing!
	        
	        System.out.println("--------Using 2d way-------------");
	        child.parentNumbers(5, 6); //we're calling methods that's swap
	        child.parentString("Shaban", "Haq");
	    }

}
