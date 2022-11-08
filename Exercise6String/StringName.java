package com.Exercise6String;

public class StringName {
	public static void main(String []args) {
		
	String name="Sonali Avantika Yaduvanshi";
	String add="Indore";
      
	System.out.println("Length of "+name+" is: "+name.length());
	System.out.println("7th Character is: "+name.charAt(7));
	System.out.println("Index of sonali: "+name.indexOf("Sonali"));
	System.out.println("#pose of i: "+name.indexOf("i"));
	System.out.println("last position of a: "+name.indexOf("a"));
	System.out.println("i is replaced by ee: "+name.replace("i","ee"));
	System.out.println("Lower name: "+name.toLowerCase());
	System.out.println("Upper name: "+name.toUpperCase());
	System.out.println("Starts with Yadav: "+name.startsWith("Sonali"));
    System.out.println("ma: "+name.substring(7));
    }
 
}
