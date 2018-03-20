package com.sapient.day3.oopsproblem;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[2];
		
//		Vehicle vehicle = new Vehicle(300, 4);
		Engine carEngine = new Engine("Ford");
		Car car = new Car(300, 4, carEngine);
		
		Engine planeEngine = new Engine("Boieng");
		Plane plane = new Plane(900, 300,10000, planeEngine);
		
//		vehicles[0] = vehicle;
		vehicles[0] = car;
		vehicles[1] = plane;
		
		for(Vehicle v : vehicles){
//			System.out.println(v);
			v.start();
		}

	}

}
