package com.sapient.day4.collections;

public class GCDemo {

	public static void main(String[] args) throws InterruptedException {
		
//		String str = "";
		StringBuffer str = new StringBuffer("");
		for(int i=0; i<1000000;i++){
			Thread.sleep(200);
//			str = str + i;
			str.append(i);
		}

	}

}
