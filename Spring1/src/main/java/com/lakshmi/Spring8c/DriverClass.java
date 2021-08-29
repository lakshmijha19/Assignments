package com.lakshmi.Spring8c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring8c.xml");
		((ClassPathXmlApplicationContext) context) .close();
	}

}
