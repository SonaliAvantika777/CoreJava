package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
        public static void main(String[] args) {
			
        	TreeSet ts=new TreeSet();
        	
        	ts.add(101);
        	ts.add(102);
        	ts.add(103);
        	ts.add(104);
        	ts.add(105);
        	//ts.add(null);
        	System.out.println("Tree Elements are: "+ts);
        	
        	Iterator it=ts.iterator();
        	while(it.hasNext()) {
        		//Object o=it.next();
        		//System.out.println(o);
        		String s=(String)it.next();
        		System.out.println(s);
        	}
      }
}
