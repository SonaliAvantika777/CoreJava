package com.Exercise4;

public class Ques12Palindrome {

	  public static void main(String[]args) {
	     //Palindrome num is a num that is Same after Reverse.ex=545,313,48984
	  
	  int num=515;
	  int temp=num;
	  int result=0;
	
	   while(num>0) {
		   int remainder =num%10;
		   result=result*10+remainder;
		   num=num/10;
		}
	   if (temp==result) {
		     System.out.println(result+" is Palindrome num ");
	    }else {
		      System.out.println(result+" is not Palindrome num ");
	     }
	}
}

