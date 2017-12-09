package com.example.demo.orders;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	public List<Order> getOrders() {
		return Arrays.asList(new Order("1000"),new Order("200"));
	}

}
