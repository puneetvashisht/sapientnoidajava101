package com.sapient.day2;

public class Manager extends Employee{
	
	int numberOfEmployeesUnder;
	public void approveLeave(){
		
	}
	public Manager(int id, String name, double salary, int numberOfEmployeesUnder) {
		super(id, name, salary);
		this.numberOfEmployeesUnder = numberOfEmployeesUnder;
	}
	
	
	
	
//	public Manager(int id, String name, double salary,int numberOfEmployeesUnder){
////		this.id = id;
////		this.name = name;
////		this.salary = salary;
//		super(id, name, salary);
//		this.numberOfEmployeesUnder =  numberOfEmployeesUnder;
//	}
	

}
