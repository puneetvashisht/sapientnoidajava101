package com.sapient.day3.assessment;

public class Contractual extends Employee {
	
	double ratePerMonth;
	double bonusAmount;

	public Contractual(int id, String name, double salary) {
		super(id, name);
		this.ratePerMonth = salary;
	}

	public void bonus() {
		this.ratePerMonth = this.ratePerMonth + bonusAmount;
	}

	public double getBonusAmount() {
		return bonusAmount;
	}

	public void setBonusAmount(double bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	@Override
	public String toString() {
		return "Contractual [ratePerMonth=" + ratePerMonth + ", id=" + id + ", name=" + name + "]";
	}


	
	
	

}
