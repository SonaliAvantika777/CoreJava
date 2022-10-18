package com.Exercise4;

public class Ques06Fibonacci {
	public static void main(String[]args) {
		
		int a=0;
		int b=1;
		int c;
		int n=6;
		
		System.out.println("Fibonacci Series of "+n+" is:");
		//Fibonacci series is sum of previous two numb  
		for(int i=2;i<=n;i++) {//loop starts from 2 because 0 and 1 have already printed
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	
	}
	
	

}
