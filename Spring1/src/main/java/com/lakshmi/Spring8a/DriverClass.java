package com.lakshmi.Spring8a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring8a.xml");
		((ClassPathXmlApplicationContext) context) .close();
	}

}
