package com.cg.rest.restservicecustomer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.restservicecustomer.entity.Customer;


@Service
public interface CustomerService {
	void addNewCustomer(Customer customer);

	List<Customer> getAllCustomers();

	void uppdateCustomer(Customer customer);

	void deleteCustomer(int customerId);
}
