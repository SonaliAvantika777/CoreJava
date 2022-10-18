package com.Exercise4;

public class Ques04Factorial {
   
 public static void main(String[]args) {
	   
	  int n=4;
	  int Fact=1;
	               //Factorial 0f 5(number) is 5!=5*4*3*2*1
	  System.out.println("Factorial of " +n+ ":");
	  for(int i=1;i<=n;i++) {
		  Fact=Fact*i;
		  System.out.println(Fact);
	  }
   System.out.println("Total="+Fact);
 } 
}
