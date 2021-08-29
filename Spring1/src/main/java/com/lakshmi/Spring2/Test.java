package com.lakshmi.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args)
		{
			ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
			Question q = (Question)context.getBean("question");
			
			q.display();
		}
}
