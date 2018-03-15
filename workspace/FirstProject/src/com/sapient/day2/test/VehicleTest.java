package com.sapient.day2.test;

import com.sapient.day2.Plane;
import com.sapient.day2.Vehicle;

public class VehicleTest {
	
	public static void getSpeedOfVehicle(Vehicle vehicle){
		System.out.println(vehicle.getClass().getName() +" cruising at : "+ vehicle.getMaxSpeed());
//		System.out.println(vehicle.getMaxAltitude());
		
		if(vehicle instanceof Plane){
			Plane plane = (Plane)vehicle;
			System.out.println(plane.getMaxAltitude());
		}
	}
	
//	public static void getSpeedOfPlane(Plane plane){
//		System.out.println("Plane cruising at : "+ plane.getMaxSpeed());
//	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(233);
//		vehicle.start();
		getSpeedOfVehicle(vehicle);
		
		Plane plane = new Plane(1000, 10000);
//		Upcasting, by default
//		vehicle = plane;
//		Downcasting, explicit (error prone);
//		plane= (Plane)vehicle;
		
		
//		plane.start();
		getSpeedOfVehicle(plane);
		
		
//		System.out.println(plane);
//		plane.setMaxSpeed(33443);
//		System.out.println(plane.fly());
	}

}
