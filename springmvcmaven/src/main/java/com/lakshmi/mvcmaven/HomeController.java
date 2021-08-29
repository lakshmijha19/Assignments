package com.lakshmi.mvcmaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lakshmi.mvcmaven.dao.ProgramDao;
import com.lakshmi.mvcmaven.model.Program;

@Controller
public class HomeController 
{

	@Autowired
	private ProgramDao dao;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
// ModelAttribute
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Programmer");
	}
	
	@GetMapping("getDetails")
	public String getDetails(Model m)
	{
		m.addAttribute("result", dao.getDetails());
		return "showDetails";
	}
	
	@GetMapping("getDetail")
	public String getDetail(@RequestParam int id, Model m)
	{
		m.addAttribute("result", dao.getDetail(id));
		return "showDetails";
	}
	
	@RequestMapping("addProgram")
	public String addProgram(@ModelAttribute("result") Program p)
	{
		dao.addProgram(p);
		return "showDetails";
	}
		
}
