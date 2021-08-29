package com.lakshmi.springrest2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{
	public static final String id="lakshmi";
	public static final String password="lakshmi3";
	
	@RequestMapping("/verify/{user}/{pass}")
	public String authenticate(@PathVariable(name="user") String user, @PathVariable(name="pass") String pass) 
	{
		if(user.endsWith(id) && pass.endsWith(password)) 
		{
			return "Valid User";		
	}
	else 
	{
		return "Invalid User";
	}
}
}
