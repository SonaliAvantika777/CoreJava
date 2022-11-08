package com.cloning;

import OOP.BankAccount;

public class Cloning_Customer implements Cloneable{
      public String name=null;
      public BankAccount account=null;
      
      public Cloning_Customer(String n) {
    	  name =n;
    	  account=new BankAccount(10);
      }
      
      public Object clone() throws CloneNotSupportedException {
    	  Cloning_Customer c=(Cloning_Customer)super.clone();
    	  c.account=(BankAccount)account.clone();
    	  return c;
      }
      
      public static void main(String[]args) throws CloneNotSupportedException {
    	  Cloning_Customer c1=new Cloning_Customer("Ram");
    	  Cloning_Customer c2=(Cloning_Customer)c1.clone();
    	  c2.name="Balram";
    	  c2.account.balance=20;
    	  
    	  System.out.println("Original Object ");
    	  System.out.println("Name: "+c1.name);
    	  System.out.println("Balance: "+c1.account.balance);
    	  
    	  System.out.println("\nCloned Object");
    	  System.out.println("Name: "+c2.name);
    	  System.out.println("Balance: "+c2.account.balance);
      }
}
