package com.sapient.day3.assessment;

public class Contractual extends Employee {
	
	double ratePerMonth;

	public Contractual(int id, String name, double salary) {
		super(id, name);
		this.ratePerMonth = salary;
	}

	public void bonus() {
		this.ratePerMonth = this.ratePerMonth + 5000;
	}

	@Override
	public String toString() {
		return "Contractual [ratePerMonth=" + ratePerMonth + ", id=" + id + ", name=" + name + "]";
	}


	
	
	

}
