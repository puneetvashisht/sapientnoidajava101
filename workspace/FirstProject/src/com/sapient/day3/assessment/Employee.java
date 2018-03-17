package com.sapient.day3.assessment;

public abstract class Employee {
	
	int id;
	String name;
	
	
	public abstract void bonus();
//	public void bonus() {
//		System.out.println("Default method -- does nothing");
//	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
