package com.class32;
import java.util.ArrayList;
import java.util.Iterator;
public class CreditcardTest {

	public static void main(String[] args) {
	
		Visa visa=new Visa("Visa platinum"); //heterogeneous objects--> they all from different ClASSES
		AX ax=new AX("Ax Rewards"); // or CreditCard ax=new Ax(); --> referred to our parent
		MasterCard mc=new MasterCard("Mc basic");
		
/*or List*/	ArrayList<CreditCard>alist=new ArrayList<>(); //<CreditCard> name of the parent class or object --> can store only objects of class CreditCard or its subclasses!!
// our arrayList is a generic cause all elements of the same type	
		
		alist.add(visa); // storing obj of user defined classes
		alist.add(ax);
		alist.add(mc);
		
		// how can i get a name of each class
		for (CreditCard card:alist) {
		System.out.println(card.creditCardName);
		card.intrestRate();
		card.annulaFee();
		}
		// how can we print the interest rate of each card
		Iterator <CreditCard>myIterator=alist.iterator();// !!! don't forget to define the type of iterator
		while(myIterator.hasNext()) {
		CreditCard obj=	myIterator.next(); //CreditCard - our type of object
		obj.intrestRate();
		}
		// how to print an annual fee of each card
		for (int i=0; i<alist.size(); i++) {
			alist.get(i).annulaFee();// using loop we are getting the element of our list and calling the method annualFee() for each obj
		}
	}

}
