package com.lakshmi.Spring1;

public class Customer 
{
	private int customerID;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	
	
	public Customer(int customerID, String customerName, long customerContact, Address customerAddress) 
	{
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	
	public void customerDetails()
	{
		System.out.println("Customer Details : ");
		System.out.println("---------------------");
		System.out.println(getCustomerID()+" "+getCustomerName()+" "+getCustomerContact());
		customerAddress.displayAddress();
	}
}
