package com.sapient.day3.oopsproblem;

public class Engine{
	String make;

	public Engine(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Engine [make=" + make + "]";
	}

	public void start() {
		System.out.println("Starting engine first **");
		System.out.println(this);
	}
	
	
}
