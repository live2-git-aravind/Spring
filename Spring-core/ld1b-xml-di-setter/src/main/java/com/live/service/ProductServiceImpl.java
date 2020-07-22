package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	ProductRepository  productRepository; 
	private ProductServiceImpl() {
		System.out.println("private ProductServiceImpl()");
	}
	
	public ProductServiceImpl(ProductRepository repository) {
		this.productRepository=repository;
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}

}