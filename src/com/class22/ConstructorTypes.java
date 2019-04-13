package com.class22;

public class ConstructorTypes {


//	ConstructorTypes(){
//		System.out.println("i am a constructor with no parameters");
//	}

	ConstructorTypes(String str){ // str - local variable to a constructor
		System.out.println("i am a constructor with 1 parameter "+str); 
	}
	
	ConstructorTypes(int a, String str){ // it's a parameterized constructor
		System.out.println("i am a constructor with 2 parameters "+a+str);
	}
	
	public static void main(String[] args) {
		
    /*The main role of our constructor is initializing our instance variables!!!
 
     Constructor vs Method:
     Differences:
 * It must be the same name as a class, whereas Method can have any name!
 * Constructor cannot have a return type not even void, where M must have IT!!!
 * Constructor can't be static, whereas M can be static or non static
 * Constructor is getting called automatically, whereas M needs to be called
 * If we do not defined -->the constructor the compiler will create 1 default for you! whereas the Methods compiler won't create it
  	
  	Similarity:
  * Both constructors and methods have/might not have parameters
  * Access modifiers can be used
  
 
  When we make it a private --> we can instantiate the class within itself, but we won't be able to instantiate it in different classes!!!	
  If we don't create any const--> compiler will create 1 default const for us, but if we create the const -->compiler won't create any for us
		
		//ConstructorTypes obj1=new ConstructorTypes();// our execution goes on line 6-7!! */
		
		ConstructorTypes obj2=new ConstructorTypes("String"); //line 10
		
		ConstructorTypes obj3=new ConstructorTypes(123, " String");//line 14
	}

}
