package com.Class;

public class method {
	public static void main(String[]args) {
		
		int x=8;
		int y=4;
		
		int value=method.sub(x,y); //method call of custom class in main class
		System.out.println(value);
	}
    public static int sub(int a,int b) {
    	return a-b;
    }
}
