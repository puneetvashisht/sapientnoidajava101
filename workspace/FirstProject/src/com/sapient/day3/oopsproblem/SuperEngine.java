package com.sapient.day3.oopsproblem;

public class SuperEngine extends Engine{
	
	boolean booster;
	
	public SuperEngine(String make, boolean booster) {
		super(make);
		this.booster = booster;
		
	}

	@Override
	public String toString() {
		return "SuperEngine [booster=" + booster + ", make=" + make + "]";
	}

//	@Override
	public void start() {
		System.out.println("Starting engine first **");
		System.out.println(this);
	}
}
