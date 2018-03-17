package com.sapient.day3.assessment;

public abstract class Bike {
	
	int speed;
	Bike(int speed){
		this.speed = speed;
	}
	
	public abstract void changeGears();
	
	public abstract void speedUp();
	
	public  void brakeDown(){
		speed--;
		System.out.println("Common way of applying brakes");
	}
}
