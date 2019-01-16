package com.cg.rest.restservicecustomer.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.restservicecustomer.entity.Customer;
import com.cg.rest.restservicecustomer.service.CustomerService;


@RestController
@RequestMapping("/customers") //Addressable Resource
public class CustomerResource {

	@Autowired
	private CustomerService service;

	@PostMapping // Uniform constraint interface
	public void addNewCustomer(@RequestBody Customer customer) {
		service.addNewCustomer(customer);
	}

	@GetMapping // Uniform constraint interface
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}
	
	@PutMapping
	public void uppdateCustomer(@RequestBody Customer customer ) {
		service.uppdateCustomer(customer);
	}
	
	@DeleteMapping("/{customerId}")
	public void updateCustomer(@PathVariable int customerId) {
		service.deleteCustomer(customerId); 
	}

}
