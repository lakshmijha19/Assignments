package com.lakshmi.Spring10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAwareTest {
 
    public static void main(String[] args) {
       
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
 
        ApplicationContextAwareImpl applicationContextAwareImpl = (ApplicationContextAwareImpl) applicationContext.getBean("applicationContextAware");
       
        System.out.println("Application context aware output");
        applicationContextAwareImpl.displayPersonDetails();
       
        applicationContext.registerShutdownHook();
    }
}