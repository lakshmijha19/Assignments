package com.lakshmi.springmvcboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lakshmi.springmvcboot.model.Program;

@Controller
public class HomeController 
{
//		@RequestMapping("/")
//		public String home()
//		{
//			return "index";
//		}
//
//		@RequestMapping("add")
//		public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j)
//		{
//			ModelAndView mv= new ModelAndView();
//			
//			mv.setViewName("result");	//View: Layout Page
//			
////View Alternative: ModelAndView mv= new ModelAndView("result");
//					
//			int num3 = i+j;
//			mv.addObject("num3",num3);		//Model: Data num3
//			
//			return mv;
//		}
//		
// 2: Remove HttpSession Using ModelAndView
		
//		@RequestMapping("add")
//		public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session)
//		{
//			int num3 = i+j;
//			session.setAttribute("num3", num3);
//			
//			return "result.jsp";
//		}
		
// 1: Using Servlet : Code is not good		
		
//		@RequestMapping("add")
//		public String add(HttpServletRequest req)
//		{
//			int i = Integer.parseInt(req.getParameter("num1"));
//			int j = Integer.parseInt(req.getParameter("num2"));
//			
//			int num3 = i + j;
//			
//			HttpSession session = req.getSession();
//			session.setAttribute("num3", num3);
//			
//			return "result.jsp";
//		}
		
	@RequestMapping("/")
	public String home()
	{
		return "modelindex";
	}
	
//	@RequestMapping("addProgram")
//	public String addProgram(@RequestParam("id") int id, @RequestParam("name") String name, Model m)
//	{
//		Program p= new Program();
//		p.setId(id);
//		p.setName(name);
//		
//		m.addAttribute("details", p);
//		return "modelresult";
//	}

	
// ModelAttribute
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Programmer");
	}
	
	@GetMapping("getProgrammers")
	public String getProgrammers(Model m)
	{
		List<Program> program=Arrays.asList(new Program(101,"Lakshmi"), new Program(102,"Sneha"));
		m.addAttribute("result", program);
		
		return "showProgrammers";
	}
	
	
	@RequestMapping(value="addProgram", method=RequestMethod.POST)
	
// method=RequestMethod.POST Alternative: @PostMapping(value="addProgram")
	public String addProgram(@ModelAttribute("details") Program p, Model m)
	{
		return "modelresult";
	}
		
}
