package com.lakshmi.Spring9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanAnnotations {

	@PostConstruct
    public void customInit() 
    {
        System.out.println("@PostConstruct");
    }
     
    @PreDestroy
    public void customDestroy() 
    {
        System.out.println("@PreDestroy");
    }
	
}
