package com.sapient.day3;

public class OverloadingDemo {
	
	public static int add(int a, int b){
		return a+b;
	}
	protected static double add(double a, double b){
		return a+b;
	}
	
	private static long add(int a, int b, int c){
		return a+b+c;
	}
	
//	public static int add(int values[]){
//		int total = 0;
//		for(int i :values){
//			total +=i;
//		}
//		return total;
//	}
	
	public static int add(int factor, int ...values){
		int total = 0;
		for(int i :values){
			total +=i;
		}
		return total*factor;
	}
	
	public static void main(String[] args) {
		add(2,3);
		add(2,23.2);
//		int arr[] = {}
		int result = add(2,3,6,4,5);
		System.out.println(result);
	}

}
