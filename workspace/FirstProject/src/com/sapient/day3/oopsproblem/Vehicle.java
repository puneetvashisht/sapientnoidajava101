package com.sapient.day3.oopsproblem;

public abstract class Vehicle {
	
	int maxSpeed;
	int capacity;
	Engine engine;

	
	public Vehicle(int maxSpeed, int capacity, Engine engine) {
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
		this.engine = engine;
	}
	
	public abstract void start();

}
