package com.example.demo.Que8;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value="/product")
	public List<Product> getAllOrders(){
		return productRepository.findAll();
	}
	
	@RequestMapping(value="/product/{id}")
	public Optional<Product> getOrder(@PathVariable int id){
		return productRepository.findById(id);
	}
	
	@RequestMapping(value="/product" , method=RequestMethod.POST)
	public void addOrder(@RequestBody Product product) {
		productRepository.insert(product);
	}
	
	@RequestMapping(value="/product/{id}" , method=RequestMethod.PUT)
	public void updateOrder(@PathVariable int id, @RequestBody Product product) {
		productRepository.save(product);
	}
	
	@RequestMapping(value="/product/{id}" , method=RequestMethod.DELETE)
	public void deleteOrder(@PathVariable int id) {
		productRepository.deleteById(id);
	}
	

}
