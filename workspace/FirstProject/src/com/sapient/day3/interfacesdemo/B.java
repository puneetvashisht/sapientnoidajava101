package com.sapient.day3.interfacesdemo;

public class B  extends A{
	int b;
	int a;
	String c;
	
	public B(int a, String c){
		super(a);
		this.c = c;
	}

	public B(int b) {
		super();
		this.b = b;
	}

	public B(int a, int b, String c) {
//		super(a);
		this(b);
		this(a, c);
		this.b = b;
	}
	
//	public B(int c) {
//		this.c = c;
//	}
	
//	public B(int a, int b) {
//		super(a);
////		this(b);
//		this.b = b;
//		
//	}
	public void doSomething(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		B objB = new B(1,2);
		objB.doSomething();
	}
	
	
}
