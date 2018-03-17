package com.sapient.day3.assessment;

public class RoadBike extends Bike {

	RoadBike(int speed) {
		super(speed);
		
	}

	@Override
	public void changeGears() {
		System.out.println("Change uptil 7 gears");
		
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 2;
		
	}

}
