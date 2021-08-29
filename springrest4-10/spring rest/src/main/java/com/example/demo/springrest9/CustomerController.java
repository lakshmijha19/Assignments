package com.example.demo.Que9;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/customers")
	public List<Customer> getAllEmployees(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value="/customers/{id}")
	public Optional<Customer> getEmployee(@PathVariable int id){
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value="/customers" , method=RequestMethod.POST)
	public void addCustomer(@RequestBody Customer employee) {
		customerService.addCustomer(employee);
	}
	
	@RequestMapping(value="/customers/{id}" , method=RequestMethod.PUT)
	public void updateEmployee(@PathVariable int id, @RequestBody Customer customer) {
		customerService.updateCustomer(id, customer);
	}

	@RequestMapping(value="/customers/{id}" , method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
