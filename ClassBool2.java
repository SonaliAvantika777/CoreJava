package com.Class;

public class ClassBool2 {
	public static void main(String[]args) {
		int a=5;
		int b=7;
		
		ClassBool2 obj=new ClassBool2();
		boolean R=obj.mult(a,b);
		System.out.println(R);
		
		
		
	}
	public boolean mult(int x,int y) {
		boolean B= x>y;
		return B;
	}

}
