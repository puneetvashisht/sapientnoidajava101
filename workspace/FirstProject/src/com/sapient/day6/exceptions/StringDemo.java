package com.sapient.day6.exceptions;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Amit";
		String str2 = new String("Amit");
		
		if(str1 == str2){
			System.out.println("Same.");
		}
		else{
			System.out.println("Different");
		}
		
//		String result = str1.substring(0, 2);
//		System.out.println(str1);
//		System.out.println(result);
//		
//		str1 = str1 + " Kumar";
//		
//		String str2 = new String("Amit");

	}

}
