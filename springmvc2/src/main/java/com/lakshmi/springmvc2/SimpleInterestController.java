package com.lakshmi.springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lakshmi.springmvc2.model.SimpleInterest;

@Controller
public class SimpleInterestController 
{

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home()
	{
		return "simpleinterest";
	}
	
	
	@RequestMapping(value="/calculate", method=RequestMethod.POST)
	public ModelAndView calculate(@ModelAttribute("s") SimpleInterest si, Model m)
	{	
				
		double s = (si.getP()*si.getR()*si.getT())/100;	
		ModelAndView mv =new ModelAndView("result");
		mv.addObject("interest", s);
		return mv ;
	}
}
