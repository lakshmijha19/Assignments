package com.lakshmi.Spring8c;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean{
	
	@Override
	public void afterPropertiesSet()
	{
		System.out.println("Bean has been instantiated and I’m the init() method ");
	}

	@Override
	public void destroy()
	{
		System.out.println("Conatiner has been closed and I’m the destroy() method ");
	}
}
