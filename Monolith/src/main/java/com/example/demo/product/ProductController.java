package com.example.demo.product;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private final ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> products = service.getProducts();
		if (products != null && !products.isEmpty()) {
			return ResponseEntity.ok(products);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
 	

}
