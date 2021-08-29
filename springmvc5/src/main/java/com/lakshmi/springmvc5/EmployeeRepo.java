package com.lakshmi.springmvc5;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lakshmi.springmvc5.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	List<Employee> findByEname(String ename);
}
