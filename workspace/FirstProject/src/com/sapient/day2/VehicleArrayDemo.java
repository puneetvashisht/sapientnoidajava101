package com.sapient.day2;

public class VehicleArrayDemo {

	public static void main(String[] args) {
//		Vehicle vehicles[] = new Vehicle[4];
//		vehicles[0] = new Vehicle(234);
//		vehicles[1] = new Vehicle(300);
//		vehicles[2] = new Plane(234, 900);
//		vehicles[3] = new Plane();
		
		
		Vehicle v1 = new Vehicle(234);
		Vehicle v2  = new Vehicle(300);
		Vehicle v3 = new Plane(234, 900);
		Vehicle v4 = new Plane();
		Vehicle vehicles[] = {v1,v2, v3, v4}; 
		
		for(Vehicle vehicle : vehicles){
			
			vehicle.start(23);
			
//			System.out.println(vehicle.toString());
//			System.out.println("Speed :" +vehicle.getMaxSpeed());
//			
//			if(vehicle instanceof Plane){
//				Plane p = (Plane)vehicle;
//				System.out.println("Altitude: "+ p.getMaxAltitude());
//			}
			
			
		}

	}

}
