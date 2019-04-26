package com.class26;
public class TestPhone {

	public static void main(String[] args) {
		
		System.out.println("---Parent class object---");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("---Child iphone class object---");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("---Child samsung class object---");
		Samsung sam=new Samsung();
		sam.hasCamera();
		sam.makeCall();
	
		System.out.println("---Child nokia class object---");
		Nokia nokia=new Nokia();
		nokia.hasCamera();
		nokia.makeCall();
		
		System.out.println("---Child iphone class object referring to the parent---");
		Phone p=new iPhone();
		p.hasCamera();
		p.makeCall();
		
		Phone p1=new Nokia();
		p1.hasCamera();//parents method
		p1.makeCall();//parents method
		//p1.cannotbeBroken(); ---> method is undefined,available only to a child class
		
		//creating a variable of a parent type
		Phone parentPhone;
		//assigning iphone object to access different methods-parent and common with child class
		parentPhone=new iPhone();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		//assinging Samsung object
		parentPhone=new Samsung();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		//assinging Nokia object
		parentPhone=new Nokia();
		parentPhone.hasCamera();
		parentPhone.makeCall();
		
		
	}

}
