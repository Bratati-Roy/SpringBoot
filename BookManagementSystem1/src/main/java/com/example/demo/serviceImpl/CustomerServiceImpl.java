package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepo;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();
	}

}