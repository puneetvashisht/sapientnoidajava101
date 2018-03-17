package com.sapient.day3.interfacesdemo;

public class StaticDemo {
	// Instance variables
	int i;
	
	//Common Variable
	static int count;
	
	public static void anyStaticMethod(){
		System.out.println(count);
		System.out.println(i);
	}
	
	StaticDemo(int i){
		this.i = i;
		count++;
	}
	
	@Override
	public String toString() {
		return "StaticDemo [i=" + i + "]";
	}

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.count);
		
		StaticDemo obj1 = new StaticDemo(12);
		System.out.println(obj1);
		System.out.println(StaticDemo.count);
		
		StaticDemo obj2 = new StaticDemo(13);
		System.out.println(obj2);
		System.out.println(StaticDemo.count);
		System.out.println(obj2.count);
	}

}
