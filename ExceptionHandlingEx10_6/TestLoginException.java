package com.ExceptionHandlingEx10_6;

public class TestLoginException {
	
	public static void main(String[]args)throws LoginException {
		TestLoginException s=new TestLoginException();
		try {
			s.authenticate("adm");
			System.out.println("No Exception found!");
			//System.out.println(s.getmessage());
			
		}
		/*
		 * catch(LoginException e) { System.out.println("user access denied"); }
		 */finally {
			System.out.println("finally block");
		}
	}
      
	public void authenticate(String name)throws LoginException{
		
		if(!"admin".equals(name)) {
			LoginException e=new LoginException();
			throw e;
		}
	}
}
