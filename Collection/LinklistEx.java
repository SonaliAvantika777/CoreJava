package com.Collection;

import java.util.LinkedList;

public class LinklistEx {
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("One");
		l.add("Two");
		
		for(Object c:l) {
			System.out.println(c);
		}
		System.out.println(l.isEmpty());
	}

}
