package com.lakshmi.spring4;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lakshmi.springmvc4.model.Login;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	  public String init() 
	{
	    return "login";
	 }
	
	
	@GetMapping("getDetails")
	public String getDetails(Model m)
	{
		List<Login> login = Arrays.asList(new Login("Lakshmi","lakshmi3","lakshmi@email.com"));
		m.addAttribute("login", login);
		return "showDetails";
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
