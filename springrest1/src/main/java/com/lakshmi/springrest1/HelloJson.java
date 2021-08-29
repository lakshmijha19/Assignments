package com.lakshmi.springrest1;

public class HelloJson 
{
	public String message;

	public HelloJson(String message) 
	{
		this.message = message;
	}
	
	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloJson [message=" + message + "]";
	}
	
	
	
}
