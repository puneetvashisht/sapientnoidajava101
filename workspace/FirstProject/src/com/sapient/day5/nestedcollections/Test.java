package com.sapient.day5.nestedcollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void getBankNames(Map<String, Bank> bankMap){
		System.out.println(bankMap.keySet());
	}

	
	public static void fetchBranchesForBank(Map<String, Bank> bankMap, String bankName){
		Bank bank = bankMap.get(bankName);
		System.out.println(bank.branches);
		
	}
	public static void main(String[] args) {
		Branch branch1 = new Branch(1, "GKBranch", "GK" );
		Branch branch2 = new Branch(2, "JBranch", "Jangpura" );
		
		List<Branch> branches = new ArrayList<>();
		branches.add(branch1);
		branches.add(branch2);
		
		
		
		Bank bankICICI = new Bank(1,"ICICI", branches);
		
		Branch newbranch = new Branch(1, "Rohini", "Rohini" );
		bankICICI.addBranch(newbranch);
		
		System.out.println(bankICICI);
		
		Map<String, Bank> bankMap = new HashMap<>();
		bankMap.put("ICICI", bankICICI);
		
		
		
		
		Branch hdfcbranch1 = new Branch(1, "GKB", "GK" );
		Branch hdfcbranch2 = new Branch(2, "JKB", "JanakPuri" );
		
		List<Branch> hdfcbranches = new ArrayList<>();
		hdfcbranches.add(hdfcbranch1);
		hdfcbranches.add(hdfcbranch2);
		
		Bank bankHDFC = new Bank(2,"HDFC", hdfcbranches);
		
		
		bankMap.put("HDFC", bankHDFC);
		
		System.out.println(bankMap);
		
		getBankNames(bankMap);
		
		fetchBranchesForBank(bankMap, "ICICI");
		fetchBranchesForBank(bankMap, "HDFC");
		

	}

}
