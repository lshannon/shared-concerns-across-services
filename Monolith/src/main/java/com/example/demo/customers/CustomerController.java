package com.example.demo.customers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerController(CustomerService customeService) {
		this.customerService = customeService;
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getCustomer() {
		return ResponseEntity.ok(customerService.getCustomers());
		
	}

}
