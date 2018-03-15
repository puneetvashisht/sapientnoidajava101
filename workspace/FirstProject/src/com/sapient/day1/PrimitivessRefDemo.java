package com.sapient.day1;

class Num{
	int i;
	Num(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "Num [i=" + i + "]";
	}
	
}

public class PrimitivessRefDemo {
	
	public static void m1(int x){
		x = x + 2;
	}
	public static void m2(Num num){
		num.i = num.i + 2;
	}

	public static void main(String[] args) {
		
		Num num = new Num(12);
		m2(num);
		System.out.println(num);
		
//		int i = 12;
//		m1(i);
//		System.out.println(i);

	}

}
