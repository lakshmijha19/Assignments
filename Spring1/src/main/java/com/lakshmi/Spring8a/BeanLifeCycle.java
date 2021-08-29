package com.lakshmi.Spring8a;

public class BeanLifeCycle {
	
	public void init()
	{
		System.out.println("Bean has been instantiated and I’m the init() method ");
	}

	public void destroy()
	{
		System.out.println("Conatiner has been closed and I’m the destroy() method ");
	}
}
