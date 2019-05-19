package com.class28;
public abstract class StaffPerson1 {

	    private String name;  //using encapsulation
	    private String adress;
	    private int salary;
	    private String vehicleType;
	    private String hireDate;
	    private int tellNum;

	    public StaffPerson1(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
	        super();
	        this.name = name;
	        this.adress = adress;
	        this.salary = salary;
	        this.vehicleType = vehicleType;
	        this.hireDate = hireDate;
	        this.tellNum = tellNum;
	    
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {//using getters & setters
	        this.name = name;
	    }
	    public String getAdress() {
	        return adress;
	    }
	    public void setAdress(String adress) {
	        this.adress = adress;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    public String getVehicleType() {
	        return vehicleType;
	    }
	    public void setVehicleType(String vehicleType) {
	        this.vehicleType = vehicleType;
	    }
	    public String getHireDate() {
	        return hireDate;
	    }
	    public void setHireDate(String hireDate) {
	        this.hireDate = hireDate;
	    }
	    public int getTellNum() {
	        return tellNum;
	    }
	    public void setTellNum(int tellNum) {
	        this.tellNum = tellNum;
	    }
	}
class Secretary1 extends StaffPerson1 {

    public Secretary1(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }
    @Override
    public String getVehicleType() { //overriding getters of parent class by using super.get()... user will be able only to read the info
        return super.getVehicleType();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getAdress() {
        return super.getAdress();
    }
    @Override
    public double getSalary() {
        return super.getSalary();
    }
    @Override
    public int getTellNum() {
        return super.getTellNum();
    }
}

class Professor extends StaffPerson1 {

    public Professor(String name, String adress, int salary, String vehicleType, String hireDate, int tellNum) {
        super(name, adress, salary, vehicleType, hireDate, tellNum);
    }
    @Override
    public String getVehicleType() {
        return super.getVehicleType(); //overriding getters of parent class by using super.get()...
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getAdress() {
        return super.getAdress();
    }
    @Override
    public double getSalary() {
        return super.getSalary();
    }
    @Override
    public int getTellNum() {
        return super.getTellNum();
    }
}
