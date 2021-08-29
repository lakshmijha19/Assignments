package com.lakshmi.springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController 
{
	@RequestMapping("/hello")  
    public String redirect()  
    {  
        return "helloworld";  
    }    
	
	
}
