package com.class26;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car car1 =new BMW();
		car1.drive();//overriding bmw method
		car1.drive(100);//parent method
		
		Car car2 =new Toyota();
		car2.drive();

		
	}

}
