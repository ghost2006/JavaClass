package com.class34;

public class Marketing {
	/* 1. Create a class called Marketing with fields of employeeName, productName and saleAmount.
	 * In your Test class have a collection of 10 marketing employees and print those who achieved more than $3000 in sales. */
	
	private String employeeName, productName;
	private double saleAmount;
	
	Marketing(String employeeName,String productName, double saleAmount){
		super();
		this.employeeName=employeeName;
		this.productName=productName;
		this.saleAmount=saleAmount;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}

	@Override
	public String toString() { //this method is provided by Java! it prints the object (all it's details)!!!
		return "Marketing [employeeName=" + employeeName + ", productName=" + productName + ", saleAmount=" + saleAmount + "]";
	}
	
}
