package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.config.AppConfig;
import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	ProductRepository productRepository = (ProductRepository)context.getBean("oracleRepository");
    	System.out.println(productRepository); 
    	productRepository.getProducts().forEach(System.out::println);
    	context.close();
    }

}