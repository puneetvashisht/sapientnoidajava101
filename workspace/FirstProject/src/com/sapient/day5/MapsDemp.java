package com.sapient.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemp {
	
	public static Employee findByPhoneNumber(List<Employee> employees, long phoneNumber){
		
		for(Employee emp: employees){
			if(emp.phoneNumber == phoneNumber){
				return emp;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(12, "Ravi", "Sharma", 34333.3, 9999111555l);
		Employee emp2 = new Employee(123, "Ravi", "Barnes", 44333.3, 9999111666l);
		Employee emp3 = new Employee(124, "Ravi", "Kumar", 14333.3, 9999111777l);
		
		ArrayList scores = new ArrayList();
//		int i = 34;
		Integer i = 34;
		
		Integer k = new Integer(45);
		int result = i + k;
		
		
//		employees.add(emp1);
//		employees.add(emp2);
//		employees.add(emp3);
//		System.out.println(employees);
		
		
		long l = 9999111555l;
		Long l1 = null;
		
		Map<Long, Employee> employeesMap = new TreeMap<>();
		employeesMap.put(9999111666l, emp2);
		employeesMap.put(9999111555l, emp1);
		employeesMap.put(9999111777l, emp3);
		
		System.out.println(employeesMap.keySet());
		
		for(Long key: employeesMap.keySet()){
			System.out.println(employeesMap.get(key));
		}
		
		
		
		System.out.println(employeesMap.get(9999111666l));
		System.out.println(employeesMap.get(9999111777l));
		
		
//		Employee result =findByPhoneNumber(employees, 9999111667l);
//		System.out.println(result);
		
	}

}
