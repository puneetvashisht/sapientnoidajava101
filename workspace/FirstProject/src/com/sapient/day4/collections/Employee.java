package com.sapient.day4.collections;

 public class Employee implements Comparable<Employee>{
	 
	 
	
	private int id;
	public String name;
	 public double salary;
	 
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
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
//        return (this.id == emp.id);
		return this.name.equals(emp.name);
    }

	
	//Natural criteria
	@Override
	public int compareTo(Employee o) {
//		if(this.id > o.id) return 1;
//		else if(this.id < o.id) return -1;
//		else return 0;
		return this.name.compareTo(o.name);
		
	}
	 
	 

}
