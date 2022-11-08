package com.ExceptionHandlingEx10_6;

public class LoginException extends Exception{
	
	public LoginException(){
		super("Invalid User, Please correct credentials");
	}

}
