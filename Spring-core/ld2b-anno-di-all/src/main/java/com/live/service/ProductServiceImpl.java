package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.live.model.Product;
import com.live.repository.ProductRepository;
@Component("productService")
public class ProductServiceImpl implements ProductService{
@Autowired
private ProductRepository productRepository;

public ProductServiceImpl() {
	System.out.println("inside ProductServiceImpl() "+productRepository);
}
@Autowired
public void setProductRepository(ProductRepository productRepository) {
	System.out.println("setProductRepository(ProductRepository productRepository)->" +productRepository);
	this.productRepository = productRepository;
}
@Autowired
public void funProductRepository(ProductRepository productRepository) {
	System.out.println("funProductRepository(ProductRepository productRepository)->" +productRepository);
	this.productRepository = productRepository;
}

static{
	System.out.println("Static block");
}
{
	System.out.println("Generic block");
}

@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}