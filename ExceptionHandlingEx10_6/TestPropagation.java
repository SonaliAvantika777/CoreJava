package com.ExceptionHandlingEx10_6;

public class TestPropagation {
	
	public static void main(String[]args) throws Propagation {
		TestPropagation tp=new TestPropagation();
		tp.second();
	}

	public void second() throws Propagation {
		
		first();
		
			throw new Propagation();
		
	}
	
	public void first() {
		int i=10;
		int j=0;
		int k=i/j;
		}
	
}
