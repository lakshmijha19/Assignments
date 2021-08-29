package com.lakshmi.Spring9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean, DisposableBean{
	
	@Override
	public void afterPropertiesSet()
	{
		System.out.println("InitializingBean : afterPropertiesSet() ");
	}

	@Override
	public void destroy()
	{
		System.out.println("DisposableBean : destroy() ");
	}
}
