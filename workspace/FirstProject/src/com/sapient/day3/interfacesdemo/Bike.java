package com.sapient.day3.interfacesdemo;

public abstract class Bike implements IBike {
	
	int speed;
	Bike(int speed){
		this.speed = speed;
	}
	
	public  void brakeDown(){
		speed--;
		System.out.println("Common way of applying brakes");
	}
}
