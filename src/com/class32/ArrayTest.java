package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] intArray= {10,21,34};
		String []stringArray= {"Hello", "Bye"};

		Visa visa1=new Visa("Visa platinum");// created 3 obj of class visa
		Visa visa2=new Visa("Visa platinum");
		Visa visa3=new Visa("Visa platinum");
		
		AX ax1=new AX("AX platinum");// created 3 obj of class AX
		AX ax2=new AX("AX platinum");
		AX ax3=new AX("AX platinum");
		
	Visa [] visaArray= {visa1, visa2, visa3}; // array of visa objects, so we can store only Visa type obj
		
	CreditCard [] creditCard= {visa1, visa2, visa3, ax1, ax2, ax3}; // storing homogeneous values
		
	Object [] objectArray= {visa1,ax1, "John",67,true, 90.83}; // they all refer to the class of objects (even 67, 90.83, true--wrapper classes)-heterogeneous array
	
	}
}
