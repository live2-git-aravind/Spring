package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;
import com.live.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	/*ProductRepository productRepository = (ProductRepository)context.getBean("productRepository");
    	System.out.println(productRepository); 
    	productRepository.getProducts().forEach(System.out::println);*/
    	
    	ProductService productService = context.getBean("productService",ProductService.class);
    	productService.getProducts1().forEach(System.out::println);
    	productService.getProducts2().forEach(System.out::println);
    }

}