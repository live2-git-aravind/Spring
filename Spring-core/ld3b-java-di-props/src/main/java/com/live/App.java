package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.live.config.AppConfig;
import com.live.repository.ProductRepository;
import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;
@PropertySource("classpath:product-service.properties")
public class App 
{
    public static void main( String[] args )
    { 	ProductRepository productRepository;
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	//ProductRepository productRepository = (ProductRepository)context.getBean("oracleRepository");
    	productRepository = context.getBean("productRepository", ProductRepository.class);
    	productRepository.getProducts().forEach(System.out::println);
    	
    	ProductService productService = context.getBean("productService", ProductServiceImpl.class);
		System.out.println("Properties File : " + productService.getDomain());
    	context.close();
    }

}