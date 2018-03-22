package com.sapient.day5;

import java.util.HashSet;
import java.util.Set;

import com.sapient.day4.collections.Employee2;

public class SetsDemo {

	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(123, "Ravi", "Sharma", 343443.34);
		Employee2 emp2 = new Employee2(112, "Ravi", "Barnes", 443443.34);
		Employee2 emp3 = new Employee2(212, "Arun", "Kumar", 243443.34);
		Employee2 emp4 = new Employee2(12, "Priya", "Negi", 143443.34);
		Employee2 emp5 = new Employee2(12, "Priya", "Negi", 143443.34);

		
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		System.out.println(emp5.hashCode());
		
		Set<Employee2> employees = new HashSet<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		boolean r1= employees.add(emp4);
		boolean r2= employees.add(emp5);
		
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println(emp4.equals(emp5));
		
		
		
		System.out.println(employees.size());

	}

}
