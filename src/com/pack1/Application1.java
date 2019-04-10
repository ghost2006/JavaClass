package com.pack1;

public class Application1 {

	public static void main(String []args) { //need main M to create the obj
	
	Animal dog1= new Animal(); // creating the instance of class Animal. here we're putting the instance in our local variable
	
	Animal dog2=new Animal(); //Animal(){} --default constructor-special type of M
	 
	Animal dog3=new Animal();
	
	System.out.println("This is a dog1");
	System.out.println(dog1.breed);
	System.out.println(dog1.age);
	System.out.println(dog1.weight);
	System.out.println(dog1.name);//Lucky
	
	dog1.name="Joe";//this one is static-->it'll change the name for every obj (dog1,dog2,dog3) even we reassigned it only for obj1!
	dog2.age =5; // isn't static,so it will change the age only for obj dog2!
	
	System.out.println("This is a dog2");
	System.out.println(dog2.breed);
	System.out.println(dog2.age);//5
	System.out.println(dog2.weight);
	System.out.println(dog2.name);//Joe
	
	System.out.println("This is a dog3");
	System.out.println(dog3.breed);
	System.out.println(dog3.age);
	System.out.println(dog3.weight);
	System.out.println(dog3.name);//Joe
	
	System.out.println(dog3.canBark());
	System.out.println(dog1.isWild());

	dog1.canBark();
	
	System.out.println(Animal.isWild());//for static variables we have to mention the class Animal--> cause it belongs to the class
	// it daesn't make any sense to do local variables static cause we use it only within M
	
	//we don't need to create the obj if we use STATIC M!!!
	int my_array []= { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //from class minimum
	System.out.println("---Printing the minimum value---");
	System.out.println(Minimum.minOfValues(my_array));//we should first mention the name of Class Minimum and then we don't need an object!!!!!
	
	System.out.println("---Printing the minimum value---class maximum");
	int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 }; //from class maximum
	System.out.println(Maximum.findMin(array));  //findMin - static M and it belongs to the class
	
	System.out.println("---Printing the maximum value---class maximum");//from class maximum
	System.out.println(Maximum.findMax(array));
	
	Minimum min=new Minimum(); //We have to create the obj if M isn't static! print()-void M
	min.print();
	
	System.out.println("--------Task Calculator----------");
	Calculator calc= new Calculator(); //should create an object!!! M isn't static
	int sum =calc.sum(12, 3, 5);
	System.out.println(calc.sum(12, 3, 5));
	System.out.println(calc.avarege(12, 3, 5));
	System.out.println(calc.max(12, 3, 5));
	System.out.println(calc.min(12, 3, 5));
	
	}	
}
