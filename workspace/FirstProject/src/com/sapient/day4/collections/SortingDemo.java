package com.sapient.day4.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e = new Employee(12, "Ravi", 343443.34);
		Employee e1 = new Employee(144, "Priya", 543443.34);
		Employee e2 = new Employee(123, "Arun", 643443.34);
		employees.add(e);
		employees.add(e2);
		employees.add(e1);
		
		System.out.println(employees);
		
//		System.out.println(e1.compareTo(e));
		// THis sorts on natural criteria : name
//		Collections.sort(employees);
		SalaryComparator salaryComparator = new SalaryComparator();
		Collections.sort(employees, salaryComparator);
		
//		Collections.sort
		System.out.println(employees);
		
	}

}
