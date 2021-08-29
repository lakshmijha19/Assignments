package com.example.demo.Que9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Que5.Employee;
import com.example.demo.Que5.EmployeeRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository ;
	
	public List<Customer> getAllCustomers(){
		List<Customer> customer = new ArrayList<>();
		customerRepository.findAll().forEach(customer::add);
		return customer;
	}

	public Optional<Customer> getCustomer(int id) {
		return customerRepository.findById(id);
	}
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void updateCustomer(int id,Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
}
