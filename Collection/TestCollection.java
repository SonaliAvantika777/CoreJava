package com.Collection;

import java.util.*;

public class TestCollection {
	
	public static void main(String[]args) {
		Collection c=new ArrayList();
		
		//Add elements into collection
		c.add("Think Po$+tive");       //index 0
		c.add("Always be H@ppy");      //index 1
		c.add("Follow the Goal&");     //index 2
		c.add("Avoid D!stractions");   //index 3
		
		System.out.println("Length of Array: "+c.size());
		System.out.println();
		
		//print all elements of Collection
		for(Object a:c) {
			System.out.println(a);
		}
		System.out.println();
		
		//convert Collection to Array
		
		Object[]arr=c.toArray();
		for(Object a:arr) {
			String s=a.toString();  //print all elements ofArray
		    System.out.println(s);
		}
		
		ArrayList b= new ArrayList();
		b.add("One");
		b.add("Two");
		b.add("Three");
		b.add("Four");
		
		System.out.println("\n"+b);
		//int size=b.size();
		System.out.println("Size of Array List: "+b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(i+". "+b);
			}
		for(Object obj:b) {
			System.out.println(obj);
		}
		Integer i=new Integer(4);
		b.add(i);
		System.out.println(b);
	}

}
