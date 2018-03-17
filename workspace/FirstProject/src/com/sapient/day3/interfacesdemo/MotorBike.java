package com.sapient.day3.interfacesdemo;

public class MotorBike implements IBike {
	
	int speed;

	
	
	public MotorBike(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public void changeGears() {
		System.out.println("Motor Bike, 4 gears!!");
		
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 20;
		
	}

	@Override
	public String toString() {
		return "MotorBike [speed=" + speed + "]";
	}
	
	

}
