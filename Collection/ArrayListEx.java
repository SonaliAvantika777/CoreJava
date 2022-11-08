package com.Collection;

import java.util.*;


public class ArrayListEx {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Hello");
		al.add("Core");
		al.add("Java");
		al.add("Students");
		al.add(525);
		
		System.out.println(al);
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object c=it.next();
			System.out.println(c);
			it.remove();
			System.out.println(al);
		}
		
		
	}

}
