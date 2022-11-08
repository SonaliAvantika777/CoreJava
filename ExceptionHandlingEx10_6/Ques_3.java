package com.ExceptionHandlingEx10_6;

public class Ques_3 {
	public static void main(String[] args) {
		int x = 7;
		int y = 0;

		try {
			int z = x / y;
			// System.out.println(z);
		} catch (RuntimeException c) {
			System.out.println("Divided bt zero");
			c.printStackTrace();
			c.getMessage();
		}catch (ArithmeticException c) {
			c.getMessage();
		} 
	}

}
