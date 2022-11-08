package com.ExceptionHandlingEx10_6;

public class ExceptionHandling{
	public static void main(String[]args) {
		int a=0;
		int b=15;
		
		try {
			int value =b/a;
			System.out.println(value);
			
		} /*
			 * catch(ArithmeticException x){ System.out.println("Divided by Zero");
			 * x.printStackTrace(); System.out.println(x.getMessage());
			 * 
			 * }
			 */finally { 
				  System.out.println("Finally Block"); }
			 
	}

}
