package com.Exercise6String;

public class String3 {
    public static void main(String[]args) {
    	
    	String s1="Sonali Yadav";
    	String s=s1.toLowerCase();
    	int t=0;
    	
    	for(char c='a';c<='z';c++,t=0) {
    		for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)==c) {
    			
    		
    		t++;
    	}
    		}
    	if(t!=0) {
    		System.out.println( c+ "=" +t);
    		t=0;
    	}
    }
}
}