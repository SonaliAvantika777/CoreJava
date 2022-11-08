package com.Collection;

import java.util.LinkedList;
import java.util.*;

public class QueueEx {
	
	public static void main(String[] args) {
		
		Queue q=new LinkedList();
		//add elements{0,1,2,3,4,5}
		for(int i=0;i<=5;i++) {
			q.add(i);
		}
		//display concept of queue
		System.out.println("Elements of Queue: "+q);
		
		//to remove the Head of queue
		int removedele=(int)q.remove();
		System.out.println("remove elements: "+removedele);
		//to view the Head of Queue
		int Head=(int)q.peek();
		System.out.println("Head of Queue: "+Head);
		
		//rest all element of Collection Interface like size 
		//and contains can be used with this Implementation
		int size=q.size();
		System.out.println("size of Queue: "+size);
		Iterator it=q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
	}

}
