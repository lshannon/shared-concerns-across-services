package com.example.demo.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {
	
	private List<Product> products = new ArrayList<Product>();

	public ProductRepo() {
		products.add(new Product("Cat Fish"));
		products.add(new Product("Cat"));
		products.add(new Product("Dog Fish"));
	}
	
	public List<Product> getProducts() {
		return products;
	}
	

}
