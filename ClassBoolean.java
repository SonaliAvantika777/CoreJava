package com.Class;

public class ClassBoolean {
	public static void main(String[]args) {
		
		int a=15;
		int b=10;
		int c=9;
		
		boolean result=sum(a,b,c);
		System.out.println(result);
	}
		
    public static boolean sum(int a,int b, int c) {
    	boolean B= a<b;
    	return (B);
    	
    }
}
