package com.Collection;

import java.util.TreeMap;

public class TreeMapEx {
           public static void main(String[] args) {
			
        	   TreeMap m=new TreeMap();
        	   m.put("one", 1);
        	   m.put("Three",3);
        	   m.put("Two",2);
        	   m.put("four",4);
        	   System.out.println(m);
        	   for(Object o:m.keySet()) {
        		   System.out.println(o+" = "+m.get(o));
        	   }
		}
}
