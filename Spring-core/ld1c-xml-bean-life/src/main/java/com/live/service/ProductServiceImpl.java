package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	ProductRepository  productRepository; 
	public ProductServiceImpl(ProductRepository repository) {
		this.productRepository=repository;
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}