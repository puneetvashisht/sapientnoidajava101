package com.sapient.day3.assessment;

public class TestBike {

	public static void main(String[] args) {
		
//		Bike bike = new Bike(5);
		RoadBike road1 = new RoadBike(5);
		
		MountainBike mountain1 = new MountainBike(5);
		
		Bike bikes[] = {road1, mountain1};
		
		for(Bike bike : bikes){
			System.out.println("Before *: " + bike.speed);
			bike.changeGears();
			System.out.println("After *: " + bike.speed);
		}

	}

}
