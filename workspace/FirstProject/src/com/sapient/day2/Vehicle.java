package com.sapient.day2;

public class Vehicle {
	
	private int maxSpeed;
	public Vehicle(){
		
	}
	public Vehicle(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}
	
	

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed < 0) throw new RuntimeException(" Speed should b above 0");
		this.maxSpeed = maxSpeed;
	}
	
	
	protected Vehicle start(int a){
		System.out.println("Vehicle**** Starting vehicle @maxSpeed: "+ this.maxSpeed);
		return null;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + "]";
	}

	
}
