package com.Exercise4;

  public class Ques11PrimeNum {
	 
	public static void main(String[]args) { 
		   
		    int a= 89;
		    int count=0;
		    
			for(int i=2;i<a;i++) {
				
				if(a%i==0) {
			        count++;
				}
			}
			if(count==0) {
				System.out.println(a+" is Prime number");
			}else {
				System.out.println(a+" is not a Prime number");
			}
	}
		
	}


