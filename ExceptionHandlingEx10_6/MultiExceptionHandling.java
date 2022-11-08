package com.ExceptionHandlingEx10_6;

public class MultiExceptionHandling {
	
	public static void main(String[] args) {
		String name="Sonali";
		try {
			//get the length of string
			System.out.println("length of "+name+": "+name.length());
			
			//get 7th character of string
			System.out.println("7th char of "+name+": "+name.charAt(6));
		
		}
		catch(NullPointerException e) {
			//execute when name is null
			System.out.println("Name can't be null");
			
		}catch(StringIndexOutOfBoundsException e) {
              //execute when string length is less than 7 chars
			System.out.println("String is small");
		}catch(IndexOutOfBoundsException e) {
            //execute when string length is less than 7 chars
			System.out.println("length is small");
		}
	}

}
