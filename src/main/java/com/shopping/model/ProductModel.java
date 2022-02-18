package com.shopping.model;

import java.util.ArrayList;
import java.util.List;

import com.shopping.entity.Product;

public class ProductModel {
	
	List<Product> list;

	// Adding the list of product available
	public ProductModel() {
		list = new ArrayList<Product>();
		list.add(new Product("1", "java", "java.jpg", 50.00));
		list.add(new Product("2", "C#", "C%23.jpg", 40.00));
		list.add(new Product("3", "Python", "python.jpg", 60.00));
	}

	// Find all
	public List<Product> findAll() {
		return list;
	}

	// Find particular

	public Product findById(String id) {
		for (Product p : list) {
			if (p.getId().equalsIgnoreCase(id)) {
				return p;
			}
		}
		return null;
	}

}
