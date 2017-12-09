package com.example.demo.orders;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	private OrderService orderService;
	
	public OrderController(OrderService service) {
		this.orderService = service;
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<Order>> getOrders() {
		return ResponseEntity.ok(orderService.getOrders());
	}

}
