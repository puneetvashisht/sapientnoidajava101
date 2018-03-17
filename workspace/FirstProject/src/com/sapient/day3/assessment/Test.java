package com.sapient.day3.assessment;

import java.util.concurrent.SynchronousQueue;

public class Test {
	
	public static void main(String[] args) {
		Regular regular1 = new Regular(12, "RAvi", 32323.34);
		regular1.setBonusPercentage(.12);
		Regular regular2 = new Regular(122, "Samir", 43000.34);
		regular2.setBonusPercentage(.15);
//		System.out.println(regular1);
//		regular1.bonus();
//		System.out.println(regular1);
		
		Contractual contract1 = new Contractual(13, "Priya", 32323.34);
		contract1.setBonusAmount(6000);
//		System.out.println(contract1);
//		contract1.bonus();
//		System.out.println(contract1);
		
//		Employee e = new Employee(101, "Arun");
		
		Employee employees[] = {regular1, regular2, contract1};
		
		for(Employee emp :employees){
			System.out.println(emp);
			emp.bonus();
			System.out.println(emp);
		}
		
		
	}

}
