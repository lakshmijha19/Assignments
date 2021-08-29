package com.lakshmi.Spring8b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring8b.xml");
		((ClassPathXmlApplicationContext) context) .close();
	}

}
