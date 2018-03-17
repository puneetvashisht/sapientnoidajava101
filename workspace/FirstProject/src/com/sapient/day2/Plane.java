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


	public Plane start(int a){
		System.out.println("Plane**** Starting plane @maxSpeed: "+ this.getMaxSpeed() + " can take you to @maxAltitude" + this.maxAltitude);
		return null;
	}

	public String fly() {
		return "Plane  crusing @" + maxAltitude + " at maxSpeed=" + this.getMaxSpeed() + "]";
	}
	
	@Override
	public String toString() {
		return "Plane [maxAltitude=" + maxAltitude + ", maxSpeed=" + getMaxSpeed() + "]";
	}
	
	
	
}
