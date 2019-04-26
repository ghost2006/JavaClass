package com.class27;

//abstract - non access modifier allows us to have in class implemented & unimplemented Methods!

public abstract class AbstractClass { // is defined as abstract class --> was created using keyword 'abstract'
									// and it can have implemented & unimplemented Methods( M that don't have a body)
	
	public void test() {
		System.out.println("I am a non static Test Method"); // implemented method
	}
	
	public abstract void hello();//there is no implementation! --> unimplemented Method
	// if we do -  public void hello(); --> Java will be complaining that M needs its body
}
