package com.sapient.day4.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
//		fruits.add(12);
		fruits.add("Orange");
		fruits.add("Grape");
		fruits.add("Pineapple");
		
		System.out.println(fruits.contains("Banana"));
		
		System.out.println(fruits);
		
		Collections.sort(fruits);
		System.out.println(fruits);
		
		for(String str: fruits){
			System.out.println(str.substring(0, 2));
		}
		
//		for(Object obj : fruits){
//			System.out.println(obj);
//			String str = (String) obj;
//			System.out.println(str.substring(0, 2));
//		}

	}

}
