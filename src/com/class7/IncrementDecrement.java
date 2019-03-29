package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;   //incrementing the value
		System.out.println(z); 
		
		int w=2;
		w++; //incrementing by 1!
		System.out.println(w);
		
		int v=10;
		v--; //postincrement shorthand operator
		System.out.println(v);
		
		int a=10;
		int b=++a; //11-PREincrement (first increment the value by 1--> then assign the value)
		System.out.println(a);//11
		System.out.println(b);//11
		
		int c=10;
		int d=c++;//POSTincrement (first assign the value-->then increment the value)
		System.out.println(d);//10
		System.out.println(c);//11
		
		int q=100;
		int e=q--;// postdecrement
		System.out.println(e);//100
		System.out.println(q);//99
		
		int h=50;
		int g=--h;//first decrement then assign!!! predecrement 
		System.out.println(g);//49
		System.out.println(h);//49
	}
	
}
