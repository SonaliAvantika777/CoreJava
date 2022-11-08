package com.Collection;
import java.util.Iterator;
import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		
		System.out.println("Print stack"+stack);
		Iterator it=stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\nSize of stack is "+stack.size());
		
		//Return top and does not remove it
		Object obj=stack.peek();       
		System.out.println("\nTop element of stack is: "+obj);
		System.out.println(stack);
		
		//Return top and remove it from stack
		System.out.println("\nRemove elements from Stack in LIFO order: ");
		Object obj4=stack.pop();
		System.out.println(obj4);
		System.out.println(stack);
		
		Object obj3=stack.pop();
		System.out.println("\n"+obj3);
		System.out.println(stack);
		
		Object obj2=stack.pop();
		System.out.println("\n"+obj2);
		System.out.println(stack);
		
		Object obj1=stack.pop();
		System.out.println("\n"+obj1);
		System.out.println("Stack is Empty"+stack);
		}

}
