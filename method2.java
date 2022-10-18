package com.Class;

public class method2 {
	public static void main(String[]args) {
		int x=5;
		int y=9;
		method2 obj=new method2();
		int value=obj.sum1(x,y);
		System.out.println(value);
	}
   public int sum1(int m, int n) {
	   return (m+n);
   }
}
