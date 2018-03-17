package com.sapient.day3;

import com.sapient.day2.Plane;
import com.sapient.day2.Vehicle;

public class TestEmployee {

	public static void main(String[] args) {
		
		Address add = new Address(34, "GK", "New Delhi");
		Vehicle v = new Plane(900, 10000);
		
		Employee emp = new Employee(12, "Ravi",34543.34, add, v);
		System.out.println(emp);
		
		Employee emp2 = new Employee(13, "Priya",34543.34, add);
		System.out.println(emp2);
//		System.out.println(emp.address);
		
//		emp.address = null;
		emp.setAddress(null);
		emp.getAddress().changeAddress(0, "Jangpura", null);
		
		System.out.println(emp);
		
		System.out.println(getVehicle(v));
		
		

	}
	
	public static Vehicle getVehicle(Vehicle v){
//		return new Vehicle(300);
//		v = new Plane()
		System.out.println(v);
		return new Plane(999, 10000);
		
	}
	
	

}
