package com.example.demo.Que5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employee = new ArrayList<>();
		employeeRepository.findAll().forEach(employee::add);
		return employee;
	}

	public Optional<Employee> getEmployee(String employeeId) {
		return employeeRepository.findById(employeeId);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void updateEmployee(String employeeId,Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}
}
