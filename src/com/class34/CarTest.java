package com.class34;
import java.util.*;
public class CarTest {

	public static void main(String[] args) {
		
	//Create a map in which we will store the carNumber and Car Object itself
		
//		Car car1=new Car("Toyota", "Corola"); //obj of custom class is created
//		Car car2=new Car("Honda", "Accord");
//		Car car3=new Car("Lada", "Priora");
//		
//		car1.printCarDetails();
//		car2.printCarDetails();
//		car3.printCarDetails();
		
     //             Car obj	
		Map<Integer, Car> carMap=new HashMap<>();
		carMap.put(1,new Car("BMW", "X8"));  //creating an obj right away
		carMap.put(2, new Car("Audi", "R8"));
		carMap.put(3, new Car ("Mercedes", "cls"));
		
		Collection<Car>carValues=carMap.values(); // to access value--> method .values()
		for(Car car:carValues) {
			car.printCarDetails();
	}
		
	}
}
