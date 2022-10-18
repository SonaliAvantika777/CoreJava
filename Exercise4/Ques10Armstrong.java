package com.Exercise4;

public class Ques10Armstrong {
	public static void main(String[]args) {
		
		int num=371;
		int b=num;
		int result=0;
        
		while(num>0) {
			int s=num%10;
			result=result+(s*s*s);
			num=num/10;
		}
		if(b==result) {
			System.out.println("Number is Armstrong");
			
		}else {
			System.out.println("Number is not a Armstrong");
		}
			
		
	}

}
