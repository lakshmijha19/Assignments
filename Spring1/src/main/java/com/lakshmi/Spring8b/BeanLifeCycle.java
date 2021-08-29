package com.lakshmi.Spring8b;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycle {
	
	@PostConstruct
	public void init()
	{
		System.out.println("Bean has been instantiated and I’m the init() method ");
	}

	@PreDestroy
	public void destroy()
	{
		System.out.println("Conatiner has been closed and I’m the destroy() method ");
	}
}
