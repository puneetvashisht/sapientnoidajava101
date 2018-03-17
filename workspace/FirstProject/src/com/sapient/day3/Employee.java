package com.sapient.day3;

import com.sapient.day2.Vehicle;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private Address address;
	private Vehicle vehicle;
	
	public Employee(int id, String name, double salary, Address address) {
		this(id, name, salary, address, new Vehicle(300));
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		this.address = address;
		
	
	}
	
	public Employee(int id, String name, double salary, Address address, Vehicle vehicle) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
//		this(id, name, salary, address);
		this.vehicle = vehicle;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		if(address !=null)
			this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", vehicle="
				+ vehicle + "]";
	}



//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
//	}
	
	
	
	
	

}
