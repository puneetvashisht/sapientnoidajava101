package com.sapient.day4.collections;

 public class Employee2 implements Comparable<Employee2> {
	 
	 
	
	private int id;
	public String firstName;
	public String lastName;
	 public double salary;
	 
	 public Employee2(){
		 
	 }
	
	
	
	public Employee2(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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
		return "Employee2 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}



	@Override
	public int compareTo(Employee2 o) {
		if(this.firstName.equals(o.firstName)){
			return this.lastName.compareTo(o.lastName);
		}
		return this.firstName.compareTo(o.firstName);
	}

	
 

}
