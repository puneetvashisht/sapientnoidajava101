package com.sapient.day3.interfacesdemo;

public class MountainBike extends Bike{

	MountainBike(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 1;
		
	}

	@Override
	public String toString() {
		return "MountainBike [speed=" + speed + "]";
	}

	@Override
	public void changeGears() {
		System.out.println("Change uptil 21 gears");
		
	}

	
	

}
