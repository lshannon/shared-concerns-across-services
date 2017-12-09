package com.example.demo.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private final ProductRepo repo;

	public ProductService(ProductRepo repo) {
		this.repo = repo;
	}
	
	public List<Product> getProducts() {
		return repo.getProducts();
	}
	
 	
	

}
