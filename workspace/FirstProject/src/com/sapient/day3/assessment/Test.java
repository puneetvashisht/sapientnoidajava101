package com.sapient.day3.assessment;

import java.util.concurrent.SynchronousQueue;

public class Test {
	
	public static void main(String[] args) {
		Regular regular1 = new Regular(12, "RAvi", 32323.34);
		Regular regular2 = new Regular(122, "Samir", 43000.34);
//		System.out.println(regular1);
//		regular1.bonus();
//		System.out.println(regular1);
		
		Contractual contract1 = new Contractual(13, "Priya", 32323.34);
//		System.out.println(contract1);
//		contract1.bonus();
//		System.out.println(contract1);
		
		Employee e = new Employee(101, "Arun");
		
		Employee employees[] = {regular1, regular2, contract1, e};
		
		for(Employee emp :employees){
			System.out.println(emp);
			emp.bonus();
			System.out.println(emp);
		}
		
		
	}

}
