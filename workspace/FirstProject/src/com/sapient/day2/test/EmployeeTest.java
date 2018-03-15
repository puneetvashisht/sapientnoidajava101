package com.sapient.day2.test;

import com.sapient.day2.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee(1223, "Ravi", 34343.3);
		Employee emp2 = new Employee(233, "Priya", 34342.3);
		
//		emp.salary = -34333;
		emp.name = "Rajan";
		emp.setSalary(-23232);
		System.out.println(emp);
	}
}
