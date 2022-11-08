package com.Collection;
import java.util.*;

public class VectorEx {																																																																																															
	 
	  public static void main(String[] args) {
		
		  int n=5;              //size of the vector
		  
		  //declaration of the vector with initial size
		  Vector v=new Vector();
		  
		  //appending new elements at the end of the vector
		  for(int i=1;i<=n;i++) {
			  v.add(i);
		  }
		    System.out.println(v);        //print elements 
		    v.remove(3);                  //remove elements at index 3
		    System.out.println(v);        //display the vector after deletion    
		  
		  //iterating over vector elements using loop
		  for(int i=0;i<v.size();i++) {
			                               //print elements one by one
			  System.out.println(v.get(i));
		  }
	}
	}
