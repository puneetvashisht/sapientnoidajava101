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
		
		
		
		
		Employee2 emp1 = new Employee2(123, "Ravi", "Sharma", 343443.34);
		Employee2 emp2 = new Employee2(122, "Ravi", "Barnes", 443443.34);
		Employee2 emp3 = new Employee2(112, "Arun", "Kumar", 243443.34);
		Employee2 emp4 = new Employee2(12, "Priya", "Negi", 143443.34);
		Employee2 emp5 = new Employee2(12, "Priya", "Negi", 143443.34);

		SalaryComparator comparator = new SalaryComparator();
		Set<Employee2> employees = new TreeSet<>(comparator);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		System.out.println(emp4.equals(emp5));
		
		System.out.println(employees.size());
		
	}

}
