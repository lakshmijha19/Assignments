package com.lakshmi.springmvc3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lakshmi.springmvc3.model.Login;

@Controller
public class UserController 
{
	@RequestMapping("/")
	  public String init() 
	{
	    return "login";
	 }

	  @RequestMapping(value="submitForm", method = RequestMethod.POST)
	  public String submit(Model model, @ModelAttribute("l") Login l) 
	  {
	    if (l != null && l.getUserName() != null & l.getPassword() != null) 
	    {
	      if (l.getUserName().equals("lakshmi") && l.getPassword().equals("lakshmi3")) 
	      {
	    	  return "success";
	      } 
	      else 
	      {
	          return "error";
	      }
	      } 
	    else 
	    {
	        return "error";
	    }
	  }
}
