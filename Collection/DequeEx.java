package com.Collection;

import java.util.*;

public class DequeEx {
	public static void main(String[] args) {
		ArrayDeque q= new ArrayDeque();
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.addFirst("First");
		q.addLast("Last");
		
		System.out.println(q);
		
		Object element=q.element();
		
		element=q.remove();
		System.out.println(element);
		System.out.println(q);
		
		element=q.removeFirst();
		System.out.println(element);
		System.out.println(q);
		
		element=q.removeLast();
		System.out.println(element);
		System.out.println(q);
		

}
}