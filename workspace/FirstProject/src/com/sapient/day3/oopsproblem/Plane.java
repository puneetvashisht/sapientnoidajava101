package com.sapient.day3.oopsproblem;

public class Plane extends Vehicle {
	
	int maxAltitude;

	public Plane(int maxSpeed, int capacity, int maxAltitude, Engine engine) {
		super(maxSpeed, capacity, engine);
		this.maxAltitude = maxAltitude;
	}

	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + maxSpeed + ", capacity=" + capacity + "]";
	}

	@Override
	public void start() {
		// start the engine
		engine.start();
		
		//start the plane
		System.out.println("Starting plane **");
		System.out.println(this);
		
	}
	
	
}
