package com.class29;

public class Car {
	/*4. Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning a price of the car.
	Create 2 sub classes: Sedan and Truck.
	* The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
	if weight>2000 then returned ar price should include 10%discount, otherwise 20%discount.
	* The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
	if length of sedan is >20 feet then returned car price should include 5%discount, otherwise 10%discount (edited) */
	
	int carPrice;
    String color;
    
    int calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Car{
    int length;
    int calculateSalePrice() {
        int price =0;
        if(length > 20) {
            price = (int) (carPrice * 0.95); //downCasting from double to int
        } else {
            price = (int) (carPrice*0.9);
        }
        return price;
    }
}

class Truck extends Car{
    int weight;
    
    int calculateSalePrice() {
        int price=0;
        if(weight > 2000) {
            price = (int) (carPrice * 0.9); //downCasting from double to int
        } else {
            price = (int) (carPrice * 0.8);
        }
        return price;
    }
}

