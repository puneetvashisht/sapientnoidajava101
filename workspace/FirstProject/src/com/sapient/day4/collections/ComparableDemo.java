package com.sapient.day4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(12, "Ravi", "Sharma", 343443.34);
		Employee2 emp2 = new Employee2(12, "Ravi", "Barnes", 443443.34);
		Employee2 emp3 = new Employee2(12, "Arun", "Kumar", 343443.34);
		Employee2 emp4 = new Employee2(12, "Priya", "Negi", 343443.34);

		List<Employee2> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(employees);
		
		Collections.sort(employees);
		
		System.out.println(employees);
		
//		System.out.println(employees);
		
	}

}
