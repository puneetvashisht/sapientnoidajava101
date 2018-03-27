package com.sapient.day5.nestedcollections;

import java.util.List;

public class Bank {
	
	int id;
	String name;
	List<Branch> branches;
	public Bank(int id, String name, List<Branch> branches) {
		super();
		this.id = id;
		this.name = name;
		this.branches = branches;
	}
	
	public boolean addBranch(Branch branch){
		this.branches.add(branch);
		return true;
	}
	public boolean addBranches(List<Branch> branches){
		this.branches.addAll(branches);
		return true;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branches=" + branches + "]";
	}
	
	

}
