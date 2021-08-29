package com.lakshmi.springrest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lakshmi.springrest3.model.Address;

@Service
public class AddressService 
{
	private List<Address> address= new ArrayList<Address>(Arrays.asList(
			new Address("396191","Gujarat","Vapi","India"),
			new Address("396191","Gujarat","Chala","India")
			));
	
	public List<Address> getAllAddress(){
		return address;
	}
	
	public Address getOneAddress(String zipcode) {
		return address.stream().filter(A -> A.getZipcode().equals(zipcode)).findFirst().get();
	}
}
