package com.lakshmi.Spring6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class DbConfigMain{

			public static void main(String[] args) {
				ApplicationContext context = new ClassPathXmlApplicationContext("dbconfig.xml");
				DbClass dc = (DbClass) context.getBean("dc", DbClass.class); 
				System.out.println("URL Link: " + dc.getDburl() + ", " + " Username: " + dc.getUsername() + "," + " Password: " + dc.getPassword());
		        
				((AbstractApplicationContext) context).close();
		        
		        
		        

			}

		

}