package com.Exercise4;

public class Ques05Reverse {
	public static void main(String[]args) {
		
		int n=12345;
		//int n1=n;
		int Reverse=0;
		
		System.out.print("Reverse of "+n+" is ");
		for(int i=1;i<=5;i++) {
			int reminder=n%10;      //1%10=1
			Reverse = Reverse*10+reminder;
			
			n=n/10;
		}
			System.out.println(Reverse);
		
	}

}
