package com.sapient.day2;

public class ManagerTest {
	
	public static void main(String[] args) {
		Manager manager = new Manager(123, "RAvi" ,33433.34 , 5);
		System.out.println(manager.numberOfEmployeesUnder);
		System.out.println(manager.name);
		System.out.println(manager.getSalary());
	}

}
