package com.lakshmi.Spring9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring9.xml");
		((ClassPathXmlApplicationContext) context) .close();
	}

}
