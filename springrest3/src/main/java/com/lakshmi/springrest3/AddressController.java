package com.lakshmi.springrest3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.springrest3.model.Address;

@RestController
public class AddressController 
{
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/add")
	public List<Address> getAddress(){
		return addressService.getAllAddress();
	}

	@RequestMapping(value="/add/{zipcode}")
	public Address getOneAddress(@PathVariable String zipcode) 
	{
		return addressService.getOneAddress(zipcode);
	}
}
