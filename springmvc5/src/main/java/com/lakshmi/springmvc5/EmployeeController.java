package com.lakshmi.springmvc5;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lakshmi.springmvc5.model.Employee;

@Controller
public class EmployeeController 
{
	@Autowired
	EmployeeRepo repo;
	

	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("ename", "Employee");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getDetails")
	public String getDetails(Model m)
	{
		m.addAttribute("result", repo.findAll());
		
		return "showDetails";
	}
	
	@GetMapping("getDetail")
	public String getDetail(@RequestParam int eid,Model m)
	{
		m.addAttribute("result", repo.getOne(eid));
		
		return "showDetails";
	}
	
	@GetMapping("getDetailByName")
	public String getDetailByName(@RequestParam String ename,Model m)
	{
		m.addAttribute("result", repo.findByEname(ename));
		
		return "showDetails";
	}
	
	
	@PostMapping(value="addEmployee")
	public String addProgram(@ModelAttribute Employee e)
	{
		repo.save(e);
		return "result";
	}
	
	@DeleteMapping(value="deleteDetail")
	public String deleteDetail(@RequestParam int eid,Model m)
	{
		Optional<Employee> employee=repo.findById(eid);
		if(employee.isPresent())
			repo.delete(employee.get());
		
		return "Deleted Employee with ID: "+eid;
	}
}
