package com.example.demo.customers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	public List<Customer> getCustomers() {
		return Arrays.asList(new Customer("Josh"), new Customer("Marcin"), new Customer("Mario"));
	}

}
