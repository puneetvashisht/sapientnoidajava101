package com.sapient.day2;

 public class Employee {
	 
	 
	
	private int id;
	public String name;
	 private double salary;
	 
	 public Employee(){
		 
	 }
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0) throw new RuntimeException("Thats now allowed!!");
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 
	 

}
