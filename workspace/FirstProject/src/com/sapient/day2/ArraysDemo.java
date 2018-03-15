package com.sapient.day2;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int x = 34;
		
		int scores[] = new int[10];
		scores[0] = 34;
		scores[10] = 34;
		for(int score: scores){
			System.out.println(score);
		}
		
//		int scores[] = {23,23,34,35,6,7,0,3};
		
		System.out.println(scores[2]);
		int total = 0;
//		
//		for(int i=0;i<=scores.length; i++){
//			total += scores[i];
//		}
		// Enhanced for loop, alternative to index based loop
		for(int score: scores){
			total = total + score;
		}
		System.out.println(total / scores.length);
		
		
		

	}

}
