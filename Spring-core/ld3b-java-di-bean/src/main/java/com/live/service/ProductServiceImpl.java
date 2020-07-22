package com.live.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.live.model.Product;
import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	public ProductServiceImpl(ProductRepository productRepository) {
	}

	@Override
	public List<Product> getProducts() {
		ProductRepository productRepository = new OracleRepository();
		return productRepository.getProducts();
	}

}