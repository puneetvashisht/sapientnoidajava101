package com.sapient.day6.exceptions;

public class StackOverflowDemo {
	
	public static void m1(){
		m1();
	}
	
	public static void main(String[] args) {
		m1();
	}

}
