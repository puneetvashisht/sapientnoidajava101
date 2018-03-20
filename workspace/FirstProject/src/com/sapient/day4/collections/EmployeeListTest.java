package com.sapient.day4.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeListTest {

	public static void main(String[] args) {
//		Arrays, fixed size
//		Employee employees[] = new Employee[2];
		
//		Arrays, but growable
//		ArrayList<Employee> employees = new ArrayList<>();
		
		List<Employee> employees = new LinkedList<>();
		Employee e = new Employee(12, "Ravi", 343443.34);
		Employee e1 = new Employee(101, "Priya", 543443.34);
		Employee e2 = new Employee(123, "Arun", 243443.34);
		employees.add(e);
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
		
		Employee searchEmployee = new Employee(101, "priya", 543443.34);
		
//		Employee e4 = e1;
		
		System.out.println(e1.equals(searchEmployee));
		System.out.println(employees.contains(searchEmployee));
		System.out.println(e1 == searchEmployee);
		
		
		
		
//		System.out.println(employees.contains(searchEmployee));

	}

}
