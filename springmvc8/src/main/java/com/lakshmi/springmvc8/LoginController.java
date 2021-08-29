package com.lakshmi.springmvc8;

@Controller
public class LoginController 
{
	@GetMapping("/")
	public ModelAndView login(){
		ModelAndView m= new ModelAndView("Login");
      return m;
   }
	@GetMapping("mvc8/english")
	public ModelAndView English()
	{
			ModelAndView m1= new ModelAndView("english");
			return m1;
	}
	
	@GetMapping("mvc8/french")
	public ModelAndView French()
	{
			ModelAndView m1= new ModelAndView("french");
			return m1;
	}
	
	@GetMapping("mvc8/vietnamese")
	public ModelAndView vietnamiese()
	{
			ModelAndView m1= new ModelAndView("vietnamiese");
			return m1;
	}

}
