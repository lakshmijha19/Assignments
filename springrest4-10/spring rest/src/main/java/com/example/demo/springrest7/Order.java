package com.example.demo.Que7;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Order")
public class Order {
	
	@Id
	private int id;
	private int total;
	private String Date;
	private String customer;
	
	public Order() {
		
	}

	public Order(int id, int total, String date, String customer) {
		super();
		this.id = id;
		this.total = total;
		Date = date;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
		
	
}
