package com.example.demo.Que5;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/employees/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable String employeeId){
		return employeeService.getEmployee(employeeId);
	}
	
	@RequestMapping(value="/employees" , method=RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value="/employees/{employeeId}" , method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
		employeeService.updateEmployee(employeeId, employee);
	}

	@RequestMapping(value="/employees/{employeeId}" , method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
}
