package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.live.config.AppConfig;
import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    { 	ProductRepository productRepository;
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	//ProductRepository productRepository = (ProductRepository)context.getBean("oracleRepository");
    	productRepository = context.getBean("productRepository", ProductRepository.class);
    	productRepository.getProducts().forEach(System.out::println);
    	context.close();
    }

}