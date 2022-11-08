package com.Collection;
import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		//adding elements to HashSet
		hs.add("x");
		hs.add("y");
		hs.add("z");
		hs.add(1);
		hs.add("y");
		hs.add(null);
		System.out.println("Elements in HashSet are: "+hs);
		
		//Duplicate ele removed
		hs.add("z");
		System.out.println(hs);
		
		for(Object o:hs) {
			System.out.println(o);
		}
		
		
		
	}

}
