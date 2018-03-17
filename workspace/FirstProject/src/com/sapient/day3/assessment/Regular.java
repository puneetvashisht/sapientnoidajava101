package com.sapient.day3.assessment;

public class Regular extends Employee {
	
	double salary;

	public Regular(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	public void bonus() {
		this.salary = this.salary + (this.salary * .15);
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}
	
	
	

}
