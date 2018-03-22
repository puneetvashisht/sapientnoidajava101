package com.sapient.day4.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		if(o1.salary > o2.salary) return 1;
		else if(o1.salary < o2.salary) return -1;
		else return 0;
//		return 0;
	}

}
