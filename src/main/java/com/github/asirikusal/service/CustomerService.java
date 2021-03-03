package com.github.asirikusal.service;

import com.github.asirikusal.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.asirikusal.dao.CustomerRepository;

/**
 * the main customer service
 */
@Service
public class CustomerService {


	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {

		this.customerRepository = customerRepository;
	}

	public Customer findCustomerById(long id) {
		return customerRepository.findById(id).orElseThrow(() -> new IllegalStateException("the customer is not there"));
	}

	public Customer findCustomerByName(String name) {
		return customerRepository.findCustomerByName(name).orElseThrow(() -> new IllegalStateException("the customer is not there"));
	}

	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	}
}
