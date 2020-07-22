package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ProductRepository productRepository = (ProductRepository)context.getBean("productRepository");
    	System.out.println(productRepository); 
    	productRepository.getProducts().forEach(System.out::println);
    }

}