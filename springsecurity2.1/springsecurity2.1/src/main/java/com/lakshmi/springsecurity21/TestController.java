package com.lakshmi.springsecurity21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TestController {

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("login.jsp");
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login.jsp");
	}

	@RequestMapping("/userPage")
	public ModelAndView userDashboard() {
		return new ModelAndView("userPage.jsp");
	}

	@RequestMapping("/adminPage")
	public ModelAndView admindashboard() {
		return new ModelAndView("adminPage.jsp");
	}
}