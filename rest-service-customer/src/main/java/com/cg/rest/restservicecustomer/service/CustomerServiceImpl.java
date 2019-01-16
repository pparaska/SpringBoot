package com.cg.rest.restservicecustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.rest.restservicecustomer.entity.Customer;
import com.cg.rest.restservicecustomer.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public void addNewCustomer(Customer customer) {
		repository.save(customer);

	}

	@Override
	public List<Customer> getAllCustomers() {

		return repository.findAll();
	}

	@Override
	public void uppdateCustomer(Customer customer) {
		repository.save(customer);
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		Customer customer = repository.getOne(customerId);
		repository.delete(customer);
		
	}

}