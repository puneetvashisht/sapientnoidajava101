package com.sapient.day6.exceptions;

import com.sapient.day5.Employee;

class InvalidInputException extends RuntimeException{
	public InvalidInputException(String message){
		super(message);
	}
}

public class ExceptionDemo2 {
	
	public static double div(int a, int b){
		if(a == 0) throw new InvalidInputException("A can never be zero");
		if(b == 0) throw new RuntimeException("Division by zero!!");
		return a/b;
	}

	public static void main(String[] args) {
		try{
			double result = div(0,1);
			System.out.println(result);
		}
		catch(InvalidInputException re){
			System.out.println("Invalid input caught *** handle it here");
			re.printStackTrace();
		}
		catch(RuntimeException re){
			System.out.println("Div by zero caught *** handle it here");
			re.printStackTrace();
		}
		
		
//		try{
//			double result = div(3,0);
//			System.out.println(result);
//		}
//		catch(ArithmeticException e){
//			double result = div(3,1);
//			System.out.println(result);
//			e.printStackTrace();
//		}
		
		
//		Employee emp = null;
////		System.out.println(emp.toString());
//		
//		Integer i = null;
//		Integer j = 34;
//		
//		System.out.println();
		
//		Thread.sleep(2000);
		
		System.out.println("Allz well!!");

	}

}
