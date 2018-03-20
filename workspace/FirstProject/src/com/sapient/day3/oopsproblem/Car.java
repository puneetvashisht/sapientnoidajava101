package com.sapient.day3.oopsproblem;

public class Car extends Vehicle{

	public Car(int maxSpeed, int capacity, Engine engine) {
		super(maxSpeed, capacity, engine);
	}

	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", capacity=" + capacity + "]";
	}

	@Override
	public void start() {
		
		// start the engine
		engine.start();
		// start the car
		System.out.println("Starting car **");
		System.out.println(this.toString());
		
	}

	
}
