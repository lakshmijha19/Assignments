package com.example.demo.Que6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {
	
	@RequestMapping("/add/{a}/{b}")
	public int add(@PathVariable(name="a") int a, @PathVariable(name="b") int b) {
		int c=a+b;
		return c;
	}
	
	@RequestMapping("/sub/{a}/{b}")
	public int sub(@PathVariable(name="a") int a, @PathVariable(name="b") int b) {
		int c=a-b;
		return c;
	}
	
	@RequestMapping("/mul/{a}/{b}")
	public int mul(@PathVariable(name="a") int a, @PathVariable(name="b") int b) {
		int c=a*b;
		return c;
	}
	
	@RequestMapping("/div/{a}/{b}")
	public int div(@PathVariable(name="a") int a, @PathVariable(name="b") int b) {
		int c=a/b;
		return c;
	}
}
