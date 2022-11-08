package com.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
         public static void main(String[] args) {
			Queue q= new PriorityQueue();
		      q.add("One");
		      q.add("Two");
		      q.add("Three");
		      
		      System.out.println(q);
		      
		      //examine top element
		      Object ele=q.element();
		      System.out.println(ele);
		      
		      //remove top element
		      ele=q.remove();
		      System.out.println(ele);
		      System.out.println(q);
		      
		      Iterator it=q.iterator();
		      while(it.hasNext()) {
		    	  System.out.println(it.next());
		      }
		      
		}
}
