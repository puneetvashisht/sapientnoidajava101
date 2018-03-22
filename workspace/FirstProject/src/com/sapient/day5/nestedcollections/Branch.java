package com.sapient.day5.nestedcollections;

public class Branch {
	
	int id;
	String name;
	String location;
	public Branch(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	

}
