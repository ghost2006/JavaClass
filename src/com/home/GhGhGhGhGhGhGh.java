package com.home;

public class GhGhGhGhGhGhGh {
	public static void main(String[] args) {
		
		
		
		
		String s1="lera";
	    String s2="gowa";
	   
	    String finalS="";
	  
	    char [] arr= new char [s1.length()+s2.length()];
	    
	    for (int i=0,j=0; i<s1.length();i++,j+=2) {
	    	arr [j]=s1.charAt(i);
	    	arr[j+1]=s2.charAt(i);
	    }
	    for (int k = 0; k < arr.length; k++) {
			finalS+=arr[k];
		}
	    System.out.println(finalS);
	    
	    
	}
}
