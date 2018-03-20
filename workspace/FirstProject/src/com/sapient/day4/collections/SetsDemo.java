package com.sapient.day4.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
Set<String> fruits = new TreeSet<>();
		
		fruits.add("Apple");
//		fruits.add(12);
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		
		
		
		
		Employee2 emp1 = new Employee2(12, "Ravi", "Sharma", 343443.34);
		Employee2 emp2 = new Employee2(12, "Ravi", "Barnes", 443443.34);
		Employee2 emp3 = new Employee2(12, "Arun", "Kumar", 343443.34);
		Employee2 emp4 = new Employee2(12, "Priya", "Negi", 343443.34);

		Set<Employee2> employees = new TreeSet<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(employees);
		
	}

}
