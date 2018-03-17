package com.sapient.day3.interfacesdemo;

public class TestBike {

	public static void main(String[] args) {
		
//		Bike bike = new Bike(5);
		RoadBike road1 = new RoadBike(5);
		MountainBike mountain1 = new MountainBike(5);
		MotorBike mbike = new MotorBike(5);
		
		IBike bikes[] = {road1, mountain1, mbike};
		
		for(IBike bike : bikes){
			System.out.println("Before *: " + bike);
			bike.speedUp();
			System.out.println("After *: " + bike);
		}

	}

}
