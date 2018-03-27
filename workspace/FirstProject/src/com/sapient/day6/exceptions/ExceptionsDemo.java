package com.sapient.day6.exceptions;

public class ExceptionsDemo {
	public static void m2(int age) throws Exception{
		if(age < 18){
			throw new Exception("Eligibility age should be above 18");
		}
		
	}
	
	public static void m1(int age) throws Exception{
		
		m2(age);
//		try {
////			Guarded region, issue can happen
//			m2(age);
//		} catch (Exception e) {
//			//Handling of issue
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) {
		try {
			m1(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				m1(21);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
