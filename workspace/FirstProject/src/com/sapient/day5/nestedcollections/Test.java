package com.sapient.day5.nestedcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Branch branch1 = new Branch(1, "GKBranch", "GK" );
		Branch branch2 = new Branch(1, "JBranch", "Jangpura" );
		
		List<Branch> branches = new ArrayList<>();
		branches.add(branch1);
		branches.add(branch2);
		
		Bank bankICICI = new Bank(1,"ICICI", branches);
		
		Map<String, Bank> bankMap = new HashMap<>();
		bankMap.put("ICICI", bankICICI);
		
		System.out.println(bankMap);
		

	}

}
