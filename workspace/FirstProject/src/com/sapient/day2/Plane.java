package com.sapient.day2;

public class Plane extends Vehicle{
	private int maxAltitude;

	
	public Plane(){
		
	}
	public Plane(int maxSpeed, int maxAltitude) {
		super(maxSpeed);
		this.maxAltitude = maxAltitude;
	}

	
	public int getMaxAltitude() {
		return maxAltitude;
	}


	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}


	public void start(){
		System.out.println("Starting plane @maxSpeed: "+ this.getMaxSpeed() + " can take you to @maxAltitude" + this.maxAltitude);
	}

	public String fly() {
		return "Plane  crusing @" + maxAltitude + " at maxSpeed=" + this.getMaxSpeed() + "]";
	}
	
	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + getMaxSpeed() + "]";
	}
	
	
	
}
